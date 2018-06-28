package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Daniel_D'AGE on 28.06.2018.
 */
public class Lotto {
    public static void main(String[] args) {

        TreeSet<Integer> lotto = new TreeSet<>(); //uporządkowane wyniki losowania

        /*lotto.add(5);
        lotto.add(7);
        lotto.add(10);
        lotto.add(8);
        lotto.add(9);
        lotto.add(2);
        lotto.add(4);
        lotto.add(6);
        lotto.add(3);
        lotto.add(1);*/

        Random random = new Random();
        int number;

        while (lotto.size() != 6) {

            number = random.nextInt(49) + 1;
            lotto.add(number);

        }

        System.out.println("Wylosowano liczby:" + lotto);


    }
}
