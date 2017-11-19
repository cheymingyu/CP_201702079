import java.util.Scanner;

public class HW03_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double D;
		double x1, x2;
		
		Scanner aScanner;
		aScanner = new Scanner(System.in);
		
		System.out.println("이차방정식의 계수를 입력하시오 :");
		System.out.print("a = ");
		a=aScanner.nextDouble();
		System.out.print("b = ");
		b=aScanner.nextDouble();
		System.out.print("c = ");
		c=aScanner.nextDouble();
		
		System.out.println("a="+a+" b="+b+" c="+c);
		
		D=b*b-4*a*c;
		
		if((-0.0000001<a)&&(a<0.0000001))
			
			System.out.println("오류 : 이차항의 계수가 0 이므로, 이차방정식을 풀 수 없습니다.");
			
		
		else
		{
			if(D<0)
				
				System.out.println("판별식의 값이 0보다 작아서 실근이 존재하지 않습니다.");
			
			else 
			{
				x1=(-b+Math.sqrt(D))/(2.0*a);
				x2=(-b-Math.sqrt(D))/(2.0*a);
			
				System.out.println("The solution is either "+x1+" or "+x2);
			}
		}
		aScanner.close();
	}

}
