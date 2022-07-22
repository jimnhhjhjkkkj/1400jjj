package Ch11Array;

public class C04Array {
	public static void main(String[] args) {
		
		//1 행, 열의 크기를 키보드로 받는다
		//2 행, 열안에 각각의 위치에 값을 입력한다
		//3 각 행의 값의 총합을 따로 출력한다
		//4 각 열의 값의 총합을 따로 출력한다
		
		int [][] arr=new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				sum = sum + arr[i][j];
			}
			System.out.println(sum);
			System.out.println();
		}
//		for(int i=0;i<arr[1].length;i++) {
//			int sum = 0;
//			for(int j=0;j<arr.length;j++) {
//				sum = sum + arr[i][j];
//			}
//			System.out.println(sum);
//			System.out.println();
//		}
	}
}
