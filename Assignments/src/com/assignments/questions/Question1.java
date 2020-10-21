package com.assignments.questions;
import java.util.Scanner;

public class Question1 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int firstTerm=1,secondTerm=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//System.out.println(firstTerm);

			int thirdTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=thirdTerm;
		}	
		float sum=0, avg;
		sum+=secondTerm;
		avg=sum/n;
		System.out.println(avg);


	}

}
