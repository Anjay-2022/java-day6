package assignment;

import java.util.Random;
import java.util.Scanner;

public class CouponCode  { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();		
		int key=0;
		boolean flag = false;
		int[] coupon = new int[range];
		Random rand = new Random();
		for (int i = 1; i <= range; i++) {
			int resRandom = rand.nextInt((8999) + 1) + 1000;
			for ( int j = 0;j <= key;j++) {
				if (resRandom == coupon[j]) {
					flag = true;
				}
			}
			if (flag == false) {
				coupon[key] = resRandom;
				key++;
			}
		}

		System.out.println("Random couponcode are");
		for(int k = 0;k < key;k++) {
			System.out.println(coupon[k]);
		}

	}
}
