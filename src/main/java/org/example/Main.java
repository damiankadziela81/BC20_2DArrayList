package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList= new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("bread");
        bakeryList.add("donuts");
        bakeryList.add("pasta");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffe");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);


        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(1));

    }
}