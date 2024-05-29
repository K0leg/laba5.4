package com.company;

public class sixth {

    public static void main(String[] args) {

        int[][] array = new int[15][];

        for (int i = 0; i < 5; i++) {
            array[i] = new int[5];
        }

        for (int i = 4; i < 8; i++) {
            array[i] = new int[8];
        }

        for (int i = 8; i < 12; i++) {
            array[i] = new int[3];
        }

        for (int i = 12; i < 15; i++) {
            array[i] = new int[9];
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}