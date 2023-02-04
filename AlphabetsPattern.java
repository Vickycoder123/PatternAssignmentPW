// Q1 Write a program to Print Alphabets A,B,C,D,E,F,G using pattern programming logic.

import java.util.*;
public class AlphabetsPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i < n; i++){
            for( int j = 0; j < n; j++){
                if( i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 || i == (n-1)/2 && j <= (n-1)/2 || j == (n-1)/2 && i >0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for( int j = 0; j < n; j++){
                if( j == 0 || i == 0 && i < n-1 || j == n-1 || i == (n-1)/2 || i == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}