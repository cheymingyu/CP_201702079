import java.util.Scanner;

public class HW04_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner ascanner = new Scanner(System.in);
		
		int givenN;
		char userAnswer;
		
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
				System.out.println(givenN + " Factorial 값을 계산하려고 합니다.");
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
