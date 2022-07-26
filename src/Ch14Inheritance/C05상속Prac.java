package Ch14Inheritance;

class TV{
	private int size;	//필드, 속성
	public TV(int size) { this.size = size; }	//생성자
	protected int getSize() { return size; }	//Getter 함수
}

class ColorTV extends TV{
	
}

class IPTV extends TV{
	
}

public class C05상속Prac {

	public static void main(String[] args) {
		//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV클래스를 작성하라
		ColorTV myTV = new ColorTV(32, 1034);
		myTV.printProperty();
		//->출력결과
		//32인치 1024컬러

		//[2번] 다음 main() 메소드와 실행 결과를 참고하여 ColorTV를 상속받는 IPTV클래스를 작성하라.
		IPTV iptv = new IPTV("192.1.1.2",32,2048);	//"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
		//->나의 IPTV는 192.1.1.2 주소의 32ㅇ니치 2048컬러
	}

}
