package assignment;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nth term ");
		int range = sc.nextInt();
		int  pre=0,post=1,sum=0,count=0;
		System.out.print("Fibbanaci series is :"+pre+","+post);
		while(count  < range) {
			sum = pre +  post;
			pre=post;
			post=sum;
			System.out.print(","+sum);
			count++;
		}
	}
}
