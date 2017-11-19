import java.util.Scanner;

public class HW05_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int score;
		int numberOfStudents = 0;
		int sumOfScores = 0;
		double avg;
		
		System.out.println("<<성적 처리 프로그램을 시작합니다>>");
		
		System.out.print("성적을 입력하시오 : ");
		score = scanner.nextInt();
		
		while(score >= 0)
		{
			if(score > 100)
			{
				System.out.println("오류 : 최대점수 100을 넘었습니다.");
			}
			else
			{
				numberOfStudents = numberOfStudents + 1;
				sumOfScores = sumOfScores + score;
			}
			System.out.print("성적을 입력하시오 : ");
			score = scanner.nextInt();
		}
		avg = (double) sumOfScores / (double) numberOfStudents ;
		
		System.out.println("");
		System.out.println("학생수는 " + numberOfStudents + "명입니다.");
		System.out.println("평균은 " + avg + "입니다.");
		System.out.println("<<성적 처리 프로그램을 종료합니다>>");
		scanner.close();
	}

}
