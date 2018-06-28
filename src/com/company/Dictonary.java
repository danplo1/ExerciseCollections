package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 28.06.2018.
 */
public class Dictonary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo po polsku: ");

        String word = scanner.nextLine();
        HashMap<String, String> dictonary = new HashMap<>();

        dictonary.put("samochód","car");
        dictonary.put("droga", "road");
        dictonary.put("brama", "gate");
        dictonary.put("pociąg", "train");
        dictonary.put("stół", "table");
        dictonary.put("niebo", "sky");
        dictonary.put("nauka", "science");
        dictonary.put("rzeka", "river");

        if(dictonary.containsKey(word.toLowerCase())){ //containsKey - posiada klucz
            System.out.println("Podane słowo, to po angielsku: " + dictonary.get(word.toLowerCase()));
        }else{
            System.out.println("Nie znaleziono słowa w słowniku.");
        }

        scanner.close(); // pętla while do kolejneo zapytania

    }
}
