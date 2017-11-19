import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore () {
		int score;
		System.out.print(">점수를 입력하시오 : ");
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = null;
		student = new Student();
		int currentScore;
		currentScore = inputScore();
		
		while (currentScore >= 0)
		{
			if (currentScore > 100)
			{
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else
			{
				student.setScore(currentScore);
				System.out.println("점수 : " + student.score() + ", 학점 : " + student.grade());
			}
			currentScore = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");

	}

}
