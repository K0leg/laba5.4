package com.company;


public class seventh {

    public static void main(String[] args) {

        int array[][] = new int[7][7];
        int array2[] = new int[7];
        int counter = 0, max = 0;

        //array generation + creating an array of string sums
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 6);
                counter = counter + array[i][j];
                System.out.print(array[i][j] + " ");
            }
            array2[i] = counter;
            counter = 0;
            System.out.println();
        }
        System.out.println();

        //determination of the maximum number index
        for (int i = 1; i < array.length; i++) {
            if (array2[i] > array2[max]) {
                max = i;
            }
        }

        //display the maximum line
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[max][i] + " ");
        }
    }

}