package baek;
import java.util.Scanner;


public class B_8393 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int total = 0;
		for (int i = 0; i <= n; i++) {
			total += i;
		}
		System.out.print(total);
	}
}
