import java.util.Scanner;

public class HW04_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner aScanner;
		aScanner = new Scanner(System.in);

		char userAnswer;
		
		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�: ");
		
		userAnswer = scanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y')
		{
			double a,b,c;
			double D;
			double x1, x2;
			
			System.out.println("������������ ����մϴ�!");
			
			System.out.println("������������ ����� �Է��Ͻÿ� :");
			System.out.print("a = ");
			a=aScanner.nextDouble();
			System.out.print("b = ");
			b=aScanner.nextDouble();
			System.out.print("c = ");
			c=aScanner.nextDouble();
						
			System.out.println("a="+a+" b="+b+" c="+c);
			
			D=b*b-4*a*c;
			
			if((-0.0000001<a)&&(a<0.0000001))
				
				System.out.println("���� : �������� ����� 0 �̹Ƿ�, ������������ Ǯ �� �����ϴ�.");
					
			else
			{
				if(D<0)
					
					System.out.println("�Ǻ����� ���� 0���� �۾Ƽ� �Ǳ��� �������� �ʽ��ϴ�.");
				
				else 
				{
					x1=(-b+Math.sqrt(D))/(2.0*a);
					x2=(-b-Math.sqrt(D))/(2.0*a);
			
					System.out.println("The solution is either "+x1+" or "+x2);
				}
			}
				System.out.println("������������ Ǯ�ڽ��ϱ�?");
				System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�: ");

				userAnswer = scanner.next().charAt(0);
			}
		System.out.println("���������� Ǯ�̸� �����մϴ�.");
		
		scanner.close();
		aScanner.close();
	}

}
