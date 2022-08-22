package com.company;
import java.util.Scanner;
public class Method_exc {
    //6.5 Printing the pattern
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the number:");
        int num= sc.nextInt();
        pattern(num);
    }
    public static void pattern(int n){
        int space = n-1;
        for (int i=1;i<=n;i++){
            for (int j=1 ; j<=space;j++ ){
                System.out.print(" ");
            }
            for (int k=i;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
            space--;
        }
    }
}
