package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, Double> godMap = new HashMap<String, Double>();

    public static void main(String[] args) {


        findCity(godMap);


        Set<String> keys = godMap.keySet();
        for (String k : keys) {
            System.out.println("City: " + k);
            findCityandAvg(godMap, k, findAvg());
        }

        System.out.println(godMap);

    }


    static HashMap<String, Double> findCityandAvg(HashMap<String, Double> a, String city, double avg) {
        a.put(city, avg);
        return a;

    }

    static HashMap<String, Double> findCity(HashMap<String, Double> a) {
        System.out.println("Please enter a city name: ");
        String city = input.nextLine();
        while (!(city.equals("END"))) {
            a.put(city, null);
            System.out.println("Please enter a city name: ");
            city = input.nextLine();
        }
        return a;
    }


    static double findAvg() {
        System.out.println("Please enter the temp: ");
        double temp1 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter the temp: ");
        double temp2 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter the temp: ");
        double temp3 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter the temp: ");
        double temp4 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter the temp: ");
        double temp5 = input.nextDouble();
        input.nextLine();

        double total = temp1 + temp2 + temp3 + temp4 + temp5;

        double avg = total / 5;
        return avg;
    }
}