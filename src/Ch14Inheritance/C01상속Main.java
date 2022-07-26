package Ch14Inheritance;


class Point2D	//상위클래스(부모, 수퍼)
{
	public int x;
	public int y;
	
	public void ShowXY() {
		System.out.println("X : " + x + " Y : " + y);
	}
}

class Point3D extends Point2D{		//Point2D를 상위클래스로하는 Point3D클래스(하위/서브/자식)
	public int z;
	public void ShowXYZ() {		//추가
		ShowXY();
		System.out.println("Z : "+z);
	}
}

public class C01상속Main {

	public static void main(String[] args) {
		Point3D ob = new Point3D();
		ob.x=10;
		ob.y=10;
		ob.z=10;
		ob.ShowXY();
		ob.ShowXYZ();
		
	
	}

}
