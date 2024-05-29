package com.company;

public class fifth {

    public static void main(String[] args) {

        int array[] = new int[15];
        int counter = 0;

        for (int i = 0; i < 15; i++){
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++){
            if (array[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println("Парних елементів: " + counter);

    }

}