package Ch06ifSwitch;

import java.util.Scanner;

public class C02switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("금");
			break;
		case 2:
			System.out.println("은");
			break;
		case 3:
			System.out.println("동");
			break;
		default:
			System.out.println("!");
		}

	}

}
