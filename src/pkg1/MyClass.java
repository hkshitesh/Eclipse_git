package pkg1;
public class MyClass {
	int a, b;
	public void sum(int x, int y)
	{
		a=x;
		b=y;
		int c = a+b;
		System.out.println("Sum is: "+c);
	}	
	public static void main(String[] args) {		
		MyClass ob = new MyClass();
		ob.sum(5, 10);
	}
}
