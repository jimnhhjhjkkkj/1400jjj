package Ch06ifSwitch;

import java.util.Scanner;

public class C02switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("κΈ");
			break;
		case 2:
			System.out.println("μ");
			break;
		case 3:
			System.out.println("λ");
			break;
		default:
			System.out.println("!");
		}

	}

}
