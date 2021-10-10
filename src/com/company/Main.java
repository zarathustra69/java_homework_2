package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        int[] array_1 = {0, 1, 1, 0, 0, 0, 0, 1};
        System.out.println("1.\nДо:");
        printArray(array_1);
        for (int i = 0; i < array_1.length; i++) {
            if (array_1[i] == 0) array_1[i] = 1;
            else array_1[i] = 0;
        }
        System.out.println("После:");
        printArray(array_1);

        //2
        int[] array_2 = new int[8];
        System.out.println("2.\nДо:");
        printArray(array_2);
        for (int i = 0; i < array_2.length; i++) {
            array_2[i] = 3 * i;
        }
        System.out.println("После:");
        printArray(array_2);

        //3
        int[] array_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3.\nДо:");
        printArray(array_3);
        for (int i = 0; i < array_3.length; i++) {
            if (array_3[i] < 6)
                array_3[i] = array_3[i] * 2;
        }
        System.out.println("После:");
        printArray(array_3);

        //4
        int[][] array_4 = {{4, 4, 4, 4}, {5, 5, 5, 5}, {6, 6, 6, 6}, {7, 7, 7, 7}};
        System.out.println("4.\nДо:");
        printArray(array_4);
        for(int i = 0; i < array_4.length; i++){
            for(int j = 0; j < array_4[i].length; j++){
                if(i==j)
                    array_4[i][j] = 1;
            }
        }
        System.out.println("После:");
        printArray(array_4);

        //5
        int[] array_5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("5.");
        printArray(array_5);
        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;
        for(int i = 0; i < array_5.length; i++){
            if(array_5[i] < min_value)
                min_value = array_5[i];
            if(array_5[i] > max_value)
                max_value = array_5[i];
        }
        System.out.println("min: " + min_value + " max: " + max_value);

        //6
        int[] array_6 = {1,1,1,2,1};
        System.out.println("6.");
        printArray(array_6);
        System.out.println("Существует ли в массиве место, в к-м сумма левой и правой части равны? " + checkBalance(array_6));

    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    public static boolean checkBalance(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int sum_left = 0;
            int sum_right = 0;
            //String left = "";
            //String right = "";
            for(int j = 0; j < i; j++){
                sum_left += array[j];
                //left += array[j] + " ";
            }
            for(int j = array.length - 1; j >= i; j--) {
                sum_right += array[j];
                //right += array[j] + " ";
            }
            //System.out.println("we've compared " + left + "with " + right + " sl:" + sum_left + " sr:" + sum_right);
            if (sum_left == sum_right) {
                //System.out.println("true");
                return true;
            }
        }
        //System.out.println("false");
        return false;
    }
}
