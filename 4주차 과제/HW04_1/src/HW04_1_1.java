import java.util.Scanner;

public class HW04_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char userAnswer;
		
		System.out.println("이차방정식을 풀겠습니까?");
		System.out.print("풀겠으면 'Y'를 치십시오 : ");
		
		userAnswer = scanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y')
		{
			System.out.println("이차방정식을 계산합니다!");
			
			System.out.println("이차방정식을 풀겠습니까?");
			System.out.print("풀겠으면 'Y'를 치십시오 : ");
			
			userAnswer = scanner.next().charAt(0);
		}
		System.out.println("이차방정식 풀이를 종료합니다.");
		scanner.close();
	}

}
