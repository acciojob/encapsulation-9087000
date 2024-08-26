package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();

        rwOnly.setName("John");
        System.out.println(rwOnly.getName());
    }
}