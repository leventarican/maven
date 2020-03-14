package com.github.leventarican;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;

/**
 * Apache Avro - https://avro.apache.org/docs/current/
 * http://avro.apache.org/docs/1.7.6/gettingstartedjava.html#Defining+a+schema
 *
 * @author Levent
 */
public class App {

    List<GenericRecord> data = new ArrayList<>();
    Schema schema;
    File schemaFile = new File("src/main/resources/user.avsc");
    File serializedFile = new File("src/main/resources/users.avro");

    public static void main(String[] args) {
        System.out.println("apache avro");
    }

    void createSchemaObject() {
        System.out.println("### parse schema file (json) ###");
        try {
            schema = new Schema.Parser().parse(schemaFile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    /**
     * create data based on the schema.
     */
    void createData() {
        System.out.println("### create data ###");
        GenericRecord user1 = new GenericData.Record(schema);
        user1.put("name", "Foo");
        user1.put("favorite_number", 256);
        // Leave favorite color null
        data.add(user1);

        GenericRecord user2 = new GenericData.Record(schema);
        user2.put("name", "Bar");
        user2.put("favorite_number", 7);
        user2.put("favorite_color", "red");
        data.add(user2);
    }

    void serialize() {
        System.out.println("### serialize data from memory ###");
        try {
            DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<GenericRecord>(schema);
            DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter);
            dataFileWriter.create(schema, serializedFile);
            for (GenericRecord user : data) {
                dataFileWriter.append(user);
            }
            dataFileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    void deserialize() {
        System.out.println("### deserialize data from disk ###");
        try {
            DatumReader<GenericRecord> datumReader = new GenericDatumReader<>(schema);
            DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(serializedFile, datumReader);
            GenericRecord user = null;
            while (dataFileReader.hasNext()) {
                // Reuse user object by passing it to next(). This saves us from
                // allocating and garbage collecting many objects for files with
                // many items.
                user = dataFileReader.next(user);
                System.out.println(user);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
