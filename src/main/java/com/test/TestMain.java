package com.test;

import java.time.LocalDate;
import java.util.HashSet;

public class TestMain {

    public static void main(String[] args) {

        HashSet<Long> set = new HashSet<>();
        for (int i=0;i<1000;i++) {

            long number = 9000000000L + (long) Math.floor(Math.random() * 9_000_000_00L) + 1_000_000_00L;
            set.add(number);
            //System.out.println(number);
        }
        System.out.println(set.size());
        System.out.println(LocalDate.now());
    }
}
