package assignment;
import java.util.Scanner;
public class PerfectNumber {
	int num,sum=1;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		num = sc.nextInt();
	}
	public void store() {
		for(int i = 2;i < num;i++) {
			if (num % i == 0) {
				System.out.println("flag is : "+i);
				sum = sum + i;
			}
		}
	}
	public void dispaly() {
		if (sum == num) {
			System.out.println("Yes number is Perfect");	
		} else { 
			System.out.println("NOt Perfect");
		}
	}
	public static void main(String[] args) {
		PerfectNumber p = new PerfectNumber();
		p.input();
		p.store();
		p.dispaly();
	}
}
