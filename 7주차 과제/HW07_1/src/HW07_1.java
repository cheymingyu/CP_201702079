import java.util.Scanner;

public class HW07_1 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static int inputScore () {
		System.out.print("-점수를 입력하시오 : ");
		int score = scanner.nextInt();
		return score;
	}
	
	public static char score2Grade (int aScore) {
		if (aScore >= 90)
		{
			return 'A';
		}
		else if (aScore >= 80)
		{
			return 'B';
		}
		else if (aScore >= 70)
		{
			return 'C';
		}
		else if (aScore >= 60)
		{
			return 'D';
		}
		
		else
		{
			return 'F';
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int realScore;
		int numberOfA = 0;
		int numberOfB = 0;
		int numberOfC = 0;
		int numberOfD = 0;
		int numberOfF = 0;
		
		System.out.println("<<<성적 처리 프로그램을 시작합니다>>>");
		
		realScore = inputScore();
		
		while (realScore >= 0)
		{
			if (realScore > 100)
			{
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else
			{
				char grade = score2Grade (realScore);
				if (realScore >= 90)
				{
					numberOfA = numberOfA + 1;
				}
				else if (realScore >= 80)
				{
					numberOfB = numberOfB + 1;
				}
				else if (realScore >= 70)
				{
					numberOfC = numberOfC + 1;
				}
				else if (realScore >= 60)
				{
					numberOfD = numberOfD + 1;
				}
				
				else
				{
					numberOfF = numberOfF + 1;
				}
				System.out.println("점수 : " + realScore + "  학점 : " + grade);
			}
			realScore = inputScore();
		}
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println("");

		System.out.println("A는 " + numberOfA + "명 입니다.");
		System.out.println("B는 " + numberOfB + "명 입니다.");
		System.out.println("C는 " + numberOfC + "명 입니다.");
		System.out.println("D는 " + numberOfD + "명 입니다.");
		System.out.println("F는 " + numberOfF + "명 입니다.");
		
		System.out.println("");
		System.out.println("<<<성적 처리 프로그램을 종료합니다>>>");
	}

}
