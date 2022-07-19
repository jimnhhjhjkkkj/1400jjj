package Ch09ClassicBasic;

import java.util.Scanner;

class SumCal{
	//인자 o, 반환 o
	int sum1(int x, int y) {
		return x+y;
	}
	//인자 o, 반환 x
	void sum2(int x, int y) {
		System.out.println("void sum2(x,y) = "+(x+y));
	}
	//인자 x, 반환 o
	int sum3() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		return x + y;
	}
}

public class C06MethodTest {

	public static void main(String[] args) {
		SumCal obj1=new SumCal();
		int result = obj1.sum1(10, 20);
		System.out.println("sum1(0,20) = "+result);
		obj1.sum2(30, 40);
		int result3 = obj1.sum3();
		System.out.println("sum3( ) = "+result3);
		
	}

}
