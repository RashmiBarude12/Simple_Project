package pack1;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter number");
		        int num = sc.nextInt();
		        int count=0, rem =0, digit=0;
		        while(num!=0) {
		        	rem = num % 10;
		        	count++;
		        	digit = digit + rem;
		        	num = num / 10;        	
		        }
		        System.out.println("Addition of seprate No: "+digit);
		        System.out.println("Count : "+count);
		    }
	}
