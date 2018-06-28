package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here with Akademia Kodu

        ArrayList<String>users = new ArrayList<>();
        users.add("Tomek");
        users.add("Ania");
        users.add("Maciek");
        users.add("Ola");
        users.add("Lena");
        users.add("Bartek");

        for (String user: users){
            System.out.println(user);
        }




    }
}
