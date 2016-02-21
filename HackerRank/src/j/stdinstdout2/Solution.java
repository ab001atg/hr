package j.stdinstdout2;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		// Complete this code
		double y = sc.nextDouble();
		String s = "";
		while (sc.hasNext()) {
			s = s + sc.nextLine();
		}
		sc.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + y);
		System.out.println("Int: " + x);
	}
}
