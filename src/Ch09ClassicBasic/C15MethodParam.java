package Ch09ClassicBasic;

class Simple{
	int x;
	int y;
	
}

class Test{
	void setSimpleXY(Simple ob) {
		ob.x=100;
		ob.y=200;
	}
}

public class C15MethodParam {

	public static void main(String[] args) {
		Test tmp = new Test();
		Simple ob1 = new Simple();
		
		tmp.setSimpleXY(ob1);
		System.out.println("ob1.x = "+ob1.x+" ob1.y = "+ob1.y);

	}

}
