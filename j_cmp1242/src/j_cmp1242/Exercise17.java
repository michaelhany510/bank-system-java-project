package j_cmp1242;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		long binary1, binary2;
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		Scanner in = new Scanner(System.in);

		System.out.print("Input first binary number: ");
		binary1 = in.nextLong();
		System.out.print("Input second binary number: ");
		binary2 = in.nextLong();

		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
			System.out.printf("%f %f %f",(float)binary1 % 10, (float)binary2 % 10, (float)remainder);
			remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		--i;
		System.out.print("Sum of two binary numbers: ");
		while (i >= 0) {
			System.out.print(sum[i--]);//index 0 =MSB
		}
		System.out.print("\n");
		in.close();
	}
}
