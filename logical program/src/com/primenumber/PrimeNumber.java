package com.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		int primeNum = sc.nextInt();  
		
		for(int i = 2; i <= primeNum/2; i++) {
			if(primeNum%i == 0) {
				System.out.print(primeNum+" is not a prime number.");  
			}else {
				System.out.print(primeNum+" is a prime number. "); 
			}
			break;
		}

	}

}