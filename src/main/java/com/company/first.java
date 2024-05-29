package com.company;

public class first {

    public static void main(String[] args) {

        int array[] = new int[50];
        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
            array[j] = i;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}