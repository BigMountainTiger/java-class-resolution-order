package com.song.example;

import com.song.example.pkg_1.AClass;

public class Exe {
    
    public static void main(String[] args)
    {
        System.out.println("class-path = " + System.getProperty("java.class.path"));
        AClass.WhoAmI();
    }
}