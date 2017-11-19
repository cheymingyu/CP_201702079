import java.util.Scanner;

public class HW08_3 {
	
	private static final int MAX_SIZE = 100;
	
	private static Scanner scanner = new Scanner(System.in) ;
	
	private static int inputScore () {
		int score;
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores_Kor = new int[MAX_SIZE];
		int[] scores_Computer = new int[MAX_SIZE];
		double[] average_Student = new double[MAX_SIZE];
		double average_Class;
		int numberOfStudents = 0;
		int realScore_Kor;
		int realScore_Computer;
		double sumOfAverage = 0;
		int numberOfOverAverage =0;
		
		System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
		realScore_Kor = inputScore();
		realScore_Computer = inputScore();
		
		while ((realScore_Kor >= 0) && (realScore_Computer >= 0))
		{
			if ((realScore_Kor > 100) || (realScore_Computer > 100))
			{
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else
			{
				scores_Kor[numberOfStudents] = realScore_Kor;
				scores_Computer[numberOfStudents] = realScore_Computer;
				average_Student[numberOfStudents] = ((double) scores_Kor[numberOfStudents] + (double) scores_Computer[numberOfStudents]) / 2.0;
				numberOfStudents ++;
			}
			System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
			realScore_Kor = inputScore();
			realScore_Computer = inputScore();
		}
		
		int i = 0;
		while (i < numberOfStudents)
		{
			sumOfAverage = sumOfAverage + average_Student[i];
			i ++;
		}
		
		average_Class = sumOfAverage / (double) numberOfStudents;
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("모두 " + numberOfStudents + " 명의 성적이 입력되었습니다.");
		System.out.println("");

		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		
		int j = 0;
		while (j < numberOfStudents)
		{
			System.out.println("[" + j + "] " + scores_Kor[j] + " " + scores_Computer[j] + "(평균 " + average_Student[j] + ")");
			if (average_Student[j] >= average_Class)
			{
				numberOfOverAverage ++;
			}
			j ++;
		}
		System.out.println("");
		System.out.println("학급 평균은 " + average_Class + " 입니다.");
		System.out.println("평균 이상인 학생의 수는 " + numberOfOverAverage + " 명 입니다.");
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");

	}

}
