import java.util.Scanner;

public class HW03_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double D;
		double x1, x2;
		
		Scanner aScanner;
		aScanner = new Scanner(System.in);
		
		System.out.println("������������ ����� �Է��Ͻÿ� :");
		System.out.print("a = ");
		a=aScanner.nextDouble();
		System.out.print("b = ");
		b=aScanner.nextDouble();
		System.out.print("c = ");
		c=aScanner.nextDouble();
		
		System.out.println("a="+a+" b="+b+" c="+c);
		
		D=b*b-4*a*c;
		
		if(D<0)
			System.out.println("�Ǻ����� ���� 0���� �۾Ƽ� �Ǳ��� �������� �ʽ��ϴ�.");
		
		else 
		{
			x1=(-b+Math.sqrt(D))/(2.0*a);
			x2=(-b-Math.sqrt(D))/(2.0*a);
		
			System.out.println("The solution is either "+x1+" or "+x2);
		
		}
		aScanner.close();
	}

}
