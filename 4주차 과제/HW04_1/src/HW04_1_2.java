import java.util.Scanner;

public class HW04_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner aScanner;
		aScanner = new Scanner(System.in);

		char userAnswer;
		
		System.out.println("이차방정식을 풀겠습니까?");
		System.out.print("풀겠으면 'Y'를 치십시오: ");
		
		userAnswer = scanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y')
		{
			double a,b,c;
			double D;
			double x1, x2;
			
			System.out.println("이차방정식을 계산합니다!");
			
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
				System.out.println("이차방정식을 풀겠습니까?");
				System.out.print("풀겠으면 'Y'를 치십시오: ");

				userAnswer = scanner.next().charAt(0);
			}
		System.out.println("이차방정식 풀이를 종료합니다.");
		
		scanner.close();
		aScanner.close();
	}

}
