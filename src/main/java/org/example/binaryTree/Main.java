package org.example.binaryTree;


import org.example.Test.TestClass;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
    }

    private static String usingRandomUUID() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString().replaceAll("_", " ");
    }
}
