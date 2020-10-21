package com.assignments.questions;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		        int a[] = new int[n];
		        for(int i=0; i<n; i++)  
		        {  
		        	a[i]=sc.nextInt();  
		        } 
		        int b[] = new int[a.length]; 
		        b = a;      
		       
		  
		        System.out.println("Contents of a[] "); 
		        for (int j=0; j<a.length; j++) 
		            System.out.print(a[j] + " "); 
		  
		        System.out.println("\n\nContents of b[] "); 
		        for (int j=0; j<b.length; j++) 
		            System.out.print(b[j] + " "); 
		        b[0]++;
		        }
	
		    } 
