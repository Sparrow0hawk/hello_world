package com.hellomagic;

import com.hellomagic.CommandLineArgs;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // call static method
        CommandLineArgs.print(args);
    }

}
