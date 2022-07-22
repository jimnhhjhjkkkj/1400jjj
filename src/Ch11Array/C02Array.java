package Ch11Array;

import java.util.Arrays;
import java.util.Scanner;

public class C02Array {

	public static void main(String[] args) {
		
		//1 배열의 크기를 입력받는다
		//2 크기만큼 점수를 키보드로 부터 입력받아 배열에 차례대로 저장한다
		//3 배열에 저장된 각요소에 접근하여 전체 합과 평균을 추력
		//4 배열안의 ㅣ저장된 점수중에 가장 큰 값과 가장 작은값을 출력한다

		Scanner sc = new Scanner(System.in);
		System.out.print("크기 : ");
		int size=sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print("arr["+i+"]=");			
			arr[i]=sc.nextInt();
		}
		
		double avg=0.0;
		int max=0,min=0,sum=0;
		//합구하기
		for(int i : arr) {
			sum+=i;
		}
		//max,min구하기
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+(double)(sum)/arr.length);
		System.out.println("최대 : "+max+"최소 : "+min);
		
		
		
//		//문제
//		int arr1[]= {10,30,20,15,4};
//		sort(arr1);
//		for(int i:arr1) {
//			System.out.print(i +" ");
//		}
//		public static void sort(int[] ar) {
//			//벼열을 정렬한다
//			//선택/삽입/버블/기수/병합/..아무거나 정열 로직을 한다.
//			//선택정렬 사용
//			for(int i=0;i<ar.length;i++) {
//				for(int j=i+1;j<ar.length;j++) {
//					int tmp=ar[1];
//					ar[1]=ar[j];
//					ar[j]=tmp;
//				}
//				
//			}
//		}
	}

	private static void sort(int[] arr1) {
		// TODO Auto-generated method stub
		
	}

}
