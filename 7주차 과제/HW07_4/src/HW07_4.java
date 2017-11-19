import java.util.Scanner;

public class HW07_4 {

public static Scanner scanner = new Scanner(System.in);
	
	public static int inputScore () {
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
	
	public static double grade2Point (char aGrade) {
		if (aGrade == 'A')
		{
			return 4.0;
		}
		else if (aGrade == 'B')
		{
			return 3.0;
		}
		else if (aGrade == 'C')
		{
			return 2.0;
		}
		else if (aGrade == 'D')
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
	
	public static double calcGPA (double point_Korean, double point_English, double point_Computer) {
		return (point_Korean + point_English + point_Computer)/3.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int koreanScore;
		int englishScore;
		int computerScore;
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		System.out.println("<<<성적 처리 프로그램을 시작합니다>>>");
		
		System.out.print("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
		koreanScore = inputScore();
		englishScore = inputScore();
		computerScore = inputScore();

		while ( (koreanScore >= 0) && (englishScore >= 0) && (computerScore >= 0) )
		{
			if ( (koreanScore > 100) || (englishScore > 100) || (computerScore > 100) )
			{
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			}
			else
			{
				char koreanGrade = score2Grade (koreanScore);
				char englishGrade = score2Grade (englishScore);
				char computerGrade = score2Grade (computerScore);
				
				double koreanPoint = grade2Point (koreanGrade);
				double englishPoint = grade2Point (englishGrade);
				double computerPoint = grade2Point (computerGrade);
				
				System.out.println("[국   어] 점수 : " + koreanScore + "  학점 : " + koreanGrade + "  평점 : " + koreanPoint);
				System.out.println("[영   어] 점수 : " + englishScore + "  학점 : " + englishGrade + "  평점 : " + englishPoint);
				System.out.println("[컴퓨터] 점수 : " + computerScore + "  학점 : " + computerGrade + "  평점 : " + computerPoint);
				
				double GPA = calcGPA (koreanPoint, englishPoint, computerPoint);
				
				System.out.println("이 학생의 평균평점은 " + GPA + "입니다.");
				if (GPA >= 4.0)
				{
					count4 = count4 + 1;
				}
				else if(GPA >= 3.0)
				{
					count3 = count3 + 1;
				}
				else if(GPA >= 2.0)
				{
					count2 = count2 + 1;
				}
				else if(GPA >= 1.0)
				{
					count1 = count1 + 1;
				}
				else
				{
					count0 = count0 + 1;
				}
			}
			System.out.print("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
			koreanScore = inputScore();
			englishScore = inputScore();
			computerScore = inputScore();
		}
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		
		System.out.println("평균평점이 4.0 이상인 학생은 " + count4 + "명 입니다.");
		System.out.println("평균평점이 3.0 이상 4.0 미만인 학생은 " + count3 + "명 입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 " + count2 + "명 입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 " + count1 + "명 입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 " + count0 + "명 입니다.");
		
		System.out.println("");
		System.out.println("<<<성적 처리 프로그램을 종료합니다>>>");
	}

}
