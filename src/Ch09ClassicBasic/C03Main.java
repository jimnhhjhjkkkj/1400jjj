package Ch09ClassicBasic;

public class C03Main {

	public static void main(String[] args) {
		C03Computer mycom = new C03Computer();
		mycom.SerialNO="11-22-33";
		mycom.CPUSpec="17";
		mycom.RAMSpec="16G";
		mycom.DISKSpec="1T";
		System.out.printf("%s %s %s %s\n", mycom.SerialNO, mycom.CPUSpec, mycom.RAMSpec, mycom.DISKSpec);

	}

}
