/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva1_q2;
//Question 2: Ah Hock's Digital Signature
//Author: Teh Jia Jie
//Matric number: 25006754

import java.util.Scanner;
public class V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of inquiries
        String[] results = new String[T];
        
        for(int i=0; i<T; i++){
            int N = sc.nextInt(); // A Number
            int L = sc.nextInt(); // "Lucky Digit"
            int count_L = 0;   //declare count for each condition
            int count_odd = 0;
            int count_even = 0;
            int count_zero = 0;
            int digit;     

            while(N!=0){   // Count lucky digit, L
                digit = N % 10;
                if(digit == L)
                    count_L++;  
                else if(digit == 0)    // Count zero, even, odd digits exclude L
                    count_zero++;
                else if(digit % 2 == 0)
                    count_even++;
                else
                    count_odd++;
                N = N / 10; //update N
            }
            
            // Determine the signature based on count
            if(count_L > count_odd && count_L > count_even && count_L > count_zero)
                results[i] = "LUCKY";
            else if(count_even > count_L && count_even > count_odd && count_even > count_zero)
                results[i] = "BALANCED";
            else if(count_odd > count_L && count_odd > count_even && count_odd > count_zero)
                results[i] = "ENERGETIC";
            else
                results[i] = "NEUTRAL";
        }
        
        //print signature for  inquiries
        for(int i=0; i<T; i++){
            System.out.println(results[i]);
        }
}}