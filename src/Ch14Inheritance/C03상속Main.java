package Ch14Inheritance;

class Employee{
	String name;
	int age;
	int worktime;
	public Employee(String name, int age, int worktime) {
		super();
		this.name = name;
		this.age = age;
		this.worktime = worktime;
	}
	
}
class PartTimer extends Employee{
	int hourlywage;
	int days;
	PartTimer(String name,int age,int worktime,int hw,int days){
		super(name,age,worktime);
		hourlywage = hw;
		this.days=days;
	}
	@Override
	public String toString() {
		return "PartTimer [hourlywage=" + hourlywage + ", days=" + days + ", name=" + name + ", age=" + age
				+ ", worktime=" + worktime + "]";
	}
	
}
class Regular  extends Employee{
	int salary;
	String title;
	Regular(String name,int age,int worktime,int s , String t)
	{
		super(name,age,worktime);
		salary = s;
		title = t;
	}
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", title=" + title + ", name=" + name + ", age=" + age + ", worktime="
				+ worktime + "]";
	}
	
}
public class C03상속Main {
	public static void main(String[] args) {
					
		PartTimer hong = new PartTimer("홍길동",55,4,20000,90);
						//이름,나이,근무시간,시급,계약일수
		Regular kim = new Regular("김상중",44,8,3800,"대리");
						//이름,나이,근무시간,연봉,직책
		System.out.println(hong.toString());
		System.out.println(kim.toString());
	}
	

}
