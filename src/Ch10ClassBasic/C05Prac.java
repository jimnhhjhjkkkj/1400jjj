package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {
	public static void main(String[] args) {
		//String 클래스로 문자열을 하나 입력받습니다
		// 1 입력받은 물자열의 길이 출력
		// 2 문자열의 idx중에 2,3,4만 출력
		// 3 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당하는 문자열이 포함되어 있는지 여부 확인
		// 4 다른 문자열을 하나 더 받아서 이전에 저자오딘 무낮열에 해당 문자열이 일치하는지 여부 확인
		// 5 저장된 문자열의 길이를 확인해서, 특정문자열 위치 idx 확인 후 확인된 idx위치에서 마지막 idx까지 잘라내기
		Scanner sc = new Scanner(System.in);
		String idx = sc.nextLine();
		System.out.println(idx.charAt(2)+", "+idx.charAt(3)+", "+idx.charAt(4));
		String idxx = sc.nextLine();
		System.out.println(idx.contains(idxx));
		String idxxx = sc.nextLine();
		System.out.println(idx.equals(idxxx));
		int length = idx.length();
		int a = idx.indexOf("a");
		System.out.println(idx.substring(a,length));
	}
}
