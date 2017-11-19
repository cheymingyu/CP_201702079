import java.util.Scanner;

public class HW06_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numberOfAsterisks;
		
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다>>");
		System.out.println("");
		
		System.out.print("양의 정수 (종료하려면 음수)를 입력하시오 : ");
		numberOfAsterisks = scanner.nextInt();
		
		while(numberOfAsterisks >= 0)
		{
			printAsterisks(numberOfAsterisks);
			
			System.out.print("양의 정수 (종료하려면 음수)를 입력하시오 : ");
			numberOfAsterisks = scanner.nextInt();
		}
		
		System.out.println("");
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다>>");
		
		scanner.close();
	}
	
	private static void printAsterisks (int n) {
		int k = 0;
		
		if (n >= 0)
		{
			while(k < n)
			{
				System.out.print("*");
				k = k + 1;
			}
		}
		else
		{
			
		}
		System.out.println("");
	}

}
