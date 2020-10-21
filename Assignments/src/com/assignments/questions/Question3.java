package com.assignments.questions;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number Students");
		int n=sc.nextInt();
		int marks[]=new int[n];
		float sum=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the grade for student"+(i+1));
			marks[i]=sc.nextInt();
			if(marks[i]<0 || marks[i]>100) {
				System.out.println("Invalid garde, Try again....");
				i--;
			}
				sum = sum + marks[i];
				
		}
		float avg=(sum/n);
		System.out.println("The average is:"+avg);
	}
}


