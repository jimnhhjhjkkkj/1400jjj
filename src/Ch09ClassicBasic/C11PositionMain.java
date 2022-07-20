package Ch09ClassicBasic;

class Position{
	int xpos;
	int ypos;
	Position(){
		xpos = 100; ypos = 100;
	}
	void setposXY(int xpos) {			//선생님이 한거 보기
		int ypos = 0;
		System.out.printf("%d ", xpos);
		System.out.println(ypos);
	}
	void setposXY(int xpos, int ypos) {
		System.out.printf("%d ", xpos);
		System.out.println(ypos);
	}
}

public class C11PositionMain {

	public static void main(String[] args) {
		Position obj = new Position();
		obj.setposXY(10);		//멤버 xpos에 10이 저장, ypos는 0저장
		obj.setposXY(10,20);	//멤버 xpos, ypos에 각각 값 저장

	}

}
