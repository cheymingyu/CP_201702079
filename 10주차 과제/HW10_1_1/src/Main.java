import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore () {
		int score;
		System.out.print(">������ �Է��Ͻÿ� : ");
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
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else
			{
				student.setScore(currentScore);
				System.out.println("���� : " + student.score() + ", ���� : " + student.grade());
			}
			currentScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
