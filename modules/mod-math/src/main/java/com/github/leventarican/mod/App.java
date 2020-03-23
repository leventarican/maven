package com.github.leventarican.mod;

public class App {
    public static final String id = "mod-math";
    
    public static void main( String[] args ) {
        System.out.println(id + " implementation");
    }
    
    public String ping() {
        return id + "pong";
    }
}
