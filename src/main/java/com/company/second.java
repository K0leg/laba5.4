package com.company;

public class second {

    public static void main(String[] args) {

        int array[] = new int[20];
        for (int j = 0; j <= 9; j++){
            array[j] = (int) Math.round(Math.random() * 9);
            System.out.print(array[j] + " ");
        }

        System.out.println();

        for (int j = 0, i = 1; j <= 9; j++, i = i + 2){
            array[i] = 0;
            System.out.print(array[j] + " ");
        }

    }

}