package com.company;

public class third {

    public static void main(String[] args) {

        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        double mid1 = 0, mid2 = 0, mid3 = 0;

        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + array3[i];
            System.out.print(array3[i] + " ");
        }

        System.out.println();
        System.out.println("mid1: " + (mid1 = mid1 / 5));
        System.out.println("mid2: " + (mid2 = mid2 / 5));
        System.out.println("mid3: " + (mid3 = mid3 / 5));

        if (mid1 < mid2 && mid2 < mid3) {
            System.out.println("Найбільше значення: mid3");
        }
        else if (mid1 < mid2 && mid2 > mid3) {
            System.out.println("Найбільше значення: mid2");
        }
        else {
            System.out.println("Найбільше значення: mid1");
        }




    }

}