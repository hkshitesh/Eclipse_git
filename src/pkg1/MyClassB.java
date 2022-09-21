package pkg1;
public class MyClassB {
	int a, b;
	public void mul(int x, int y)
	{
		a=x;
		b=y;
		int c = a*b;
		System.out.println("Multiplication is: "+c);
	}	
	public static void main(String[] args) {		
		MyClassB ob = new MyClassB();
		ob.mul(5, 10);
	}
}