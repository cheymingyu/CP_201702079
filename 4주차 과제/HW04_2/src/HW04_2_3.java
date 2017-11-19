import java.util.Scanner;

public class HW04_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner ascanner = new Scanner(System.in);
		
		int fact, num, givenN;
		char userAnswer;
		
		fact = 1;
		num = 2;
		
		System.out.println("Factorial을 계산하시겠습니까?");
		System.out.print("계산하려면 'Y'를 치십시오: ");
		
		userAnswer = ascanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y')
		{
			System.out.print("정수를 입력하시오 : ");
			
			givenN = scanner.nextInt();
		
			if(givenN < 0)
				System.out.println("입력값이 음수이므로, Factorial 값을 계산할 수 없습니다.");
			else
			{
				if(givenN == 0)
					fact = 1;
				else
				{
					while(num<=givenN)
					{
						fact = fact * num;
						num = num + 1;
					}
				}
				System.out.println(givenN + "! = " + fact);
			}
			System.out.println("Factorial을 계산하시겠습니까?");
			System.out.print("계산하려면 'Y'를 치십시오: ");
			
			userAnswer = ascanner.next().charAt(0);
		}
		
		System.out.println("계산을 종료합니다.");
		scanner.close();
		ascanner.close();
	}

}
