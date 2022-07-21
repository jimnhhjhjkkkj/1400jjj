package Ch10ClassBasic;

//접근한정자
//public : 모든 클래스에서 접근 가능
//protected : 동일 패키지에 속한 클래스 or 상속과게에서 하위 클래스에서만 접근 가능
//default : 동일 패키지에 속한 클래스에서만 사용 가능 (기본 한정자)
//private : 현재 클래스에서만 접근가능

class C01Person{
	public String name;
	private int age;
	private float weight;
	private double height;
	
	//Getter(가져오기) and Setter(저장하기)
	void SetAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	float getWeight() {
		return weight;
	}
	double getHeight() {
		return height;
	}
	//생성자
	public C01Person(String name, int age, float weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
}

public class C01InfoHide {

	public static void main(String[] args) {
//		C01Person kim = new C01Person();
//		kim.name="김상중";
//		//kim.age=11;
//		kim.SetAge(55);
//		System.out.println("age = "+kim.getAge());
		
		C01Person tmp = new C01Person("홍길동",55,56.8f,77.5);
		System.out.println(tmp.toString());

	}

}
