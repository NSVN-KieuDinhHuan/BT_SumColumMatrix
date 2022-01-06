package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matrix=new int[3][3];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        print2Array(matrix);
        System.out.println("nhập vào cột cần tính tổng");
        int Col=input.nextInt();
        int sumColum=0;
        for (int row=0;row<matrix.length;row++) {
            for (int colum = 0; colum < matrix[row].length; colum++) {
                if (colum==Col){
                    sumColum+=matrix[row][colum];
                }
            }
        }
        System.out.println("Tổng của cột" +Col+"là :" +sumColum);
    }

    public static void print2Array(int[][] arr){
        for (int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                System.out.print(arr[row][colum]+" ");
            }
            System.out.print("\n");
        }
    }
}
