import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore () {
		int score;
		System.out.print("-������ �Է��Ͻÿ� : ");
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = null;
		student = new Student();
		int aScoreKorean;
		int aScoreEnglish;
		int aScoreComputer;
		System.out.println("> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�:");
		aScoreKorean = inputScore();
		aScoreEnglish = inputScore();
		aScoreComputer = inputScore();
		
		while ((aScoreKorean >= 0) && (aScoreEnglish >= 0) && (aScoreComputer >= 0))
		{
			if ((aScoreKorean > 100) || (aScoreEnglish > 100) || (aScoreComputer > 100))
			{
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else
			{
				student.setScoreKorean(aScoreKorean);
				student.setScoreEnglish(aScoreEnglish);
				student.setScoreComputer(aScoreComputer);
				
				System.out.println("[��   ��] ���� : " + student.scoreKorean() + ", ���� : " + student.gradeKorean());
				System.out.println("[��   ��] ���� : " + student.scoreEnglish() + ", ���� : " + student.gradeEnglish());
				System.out.println("[��ǻ��] ���� : " + student.scoreComputer() + ", ���� : " + student.gradeComputer());
			}
			System.out.println("> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�:");
			aScoreKorean = inputScore();
			aScoreEnglish = inputScore();
			aScoreComputer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
