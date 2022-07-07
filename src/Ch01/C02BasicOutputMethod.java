package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		// System.out : 표준 출력 스트림(해석 : 표준출력장치(모니터)에 데이터 전달)
		
		// System.out.print()
		// Escape문자 사용을 통한 개행(줄바꿈)
		// Escape : 탈출하다, 벗어나다
		// Escape문자 : 기존의 문자용도를 벗어나 특정한 기능 수행에 사용되는 문자
		// \n : 줄바꿈(개행)
		// \b : 한문자 삭제------cmd창에서만 보임 Console창에서는 이상하게 보임
		// \t : 8칸 커서 이동

//		System.out.print("   *\n");
//		System.out.print("  ***\n");
//		System.out.print(" *****\n");
//		System.out.print("*******\n");
		
		// System.out.printf()
		// format : 형식, 서식
		// 서식 : 서류를 꾸미는 일정한 양식
		
		// %d : 10진수 정수 서식 문자
		// %f : 실수 서식문자
		// %c : 한문자 서식문자
		// %s : 문자열 서식문자
		
//		System.out.printf("%d\n",10);
//		System.out.printf("%d + %d = %d\n", 10,20,10+20);
//		System.out.printf("%f + %f = %f", 10.23, 20.34, 10.23+20.34);
//		System.out.printf("%c %c %c\n", 'A', 'B', 'C');
//		System.out.printf("%s %s %s\n", "this is", "String", "Test");
//		System.out.printf("%d.%s : %d\n", 1,"성적",100);
//		
//		System.out.printf("나의 이름은 %s 입니다\n", "진한");
//		System.out.printf("나의 나이는 %d 세 입니다\n", 21);
//		System.out.printf("나의 성별은 %c 입니다\n",'남');
		
		// 서식문자 정렬/자리수정
		// %10d : 10칸 확보 후 오른쪽 정렬
		// %-10d :> 10칸 확보 후 왼쪽 정렬
//		System.out.printf("%-9d%9d\n", 1234,5678);
//		System.out.printf("%.2f\n", 10.234635);
		
		// 주의 !!!
//		System.out.print("I say \"Hello?\"");
		
		
		// System.out.println()
		System.out.println("No     이름     나이     주소");
		System.out.printf("1      %-7s%-7d%s\n","홍길동",20,"대구");
		System.out.printf("2      %-7s%-7d%s\n","홍길동",20,"대구");
		System.out.printf("3      %-7s%-7d%s\n","홍길동",20,"대구");
		System.out.printf("4      %-7s%-7d%s\n","홍길동",20,"대구");
		System.out.println("");
		System.out.println("Code     Title     Publisher     Price");
		System.out.printf("%-9d%-10s%-13s%d\n",1010,"DoItJava","00미디어",290000);
		System.out.printf("%-9d%-10s%-13s%d\n",1010,"DoItJava","00미디어",290000);
		System.out.println("");
		System.out.printf("%5s\n","*");
		System.out.printf("%5s%s\n","**","*");
		System.out.printf("%5s%s\n","***","**");
		System.out.printf("%5s%s\n","****","***");
		System.out.printf("%5s%s\n","***","**");
		System.out.printf("%5s%s\n","**","*");
		System.out.printf("%5s\n","*");
		
		
		System.out.printf("Githun Test");
	}

}
