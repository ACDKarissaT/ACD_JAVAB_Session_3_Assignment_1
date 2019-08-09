package assignment1;

public class ClassVarType {
	static int count = 0;
	int otherCount;
	
	public ClassVarType() {
		this.count++;
	}
	
	public static void main(String[] args) {
		System.out.println("Class variable before creation of objects: " + ClassVarType.count);
		ClassVarType v1 = new ClassVarType();
		
		v1.otherCount = 5;
		
		System.out.println("Class variable: " + ClassVarType.count);
		System.out.println("Instance variable: " + v1.otherCount);
		
	}
}
