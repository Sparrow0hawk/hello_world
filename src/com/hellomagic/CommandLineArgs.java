package com.hellomagic;

public class CommandLineArgs {
    public static void print(String[] args) {
        System.out.println("Number of command line args: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.print(String.format("Arg %d is %s ", i, args[i]));
        }
    }
}
