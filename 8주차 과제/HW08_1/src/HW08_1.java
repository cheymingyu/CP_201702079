import java.util.Scanner;

public class HW08_1 {
	
	private static final int MAX_SIZE = 100;
	
	private static Scanner scanner = new Scanner(System.in) ;
	
	private static int inputScore () {
		int score;
		System.out.print(">점수를 입력하시오 : ");
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents = 0;
		int realScore;
		
		realScore = inputScore();
		
		while (realScore >= 0)
		{
			if (realScore > 100)
			{
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else
			{
				scores[numberOfStudents] = realScore;
				numberOfStudents ++;
			}
			realScore = inputScore();
		}
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("모두 " + numberOfStudents + " 명의 성적이 입력되었습니다.");
		
		System.out.println("");
		System.out.println("입력된 성적은 다음과 같습니다.");
		
		int i = 0;
		while (i < numberOfStudents)
		{
			System.out.println("[" + i + "] " + scores[i] );
			i ++;
		}
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");

	}

}
