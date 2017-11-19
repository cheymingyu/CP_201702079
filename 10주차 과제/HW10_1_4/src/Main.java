import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore () {
		int score;
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = null;
		student = new Student();
		GPACounter gpaCounter = null;
		gpaCounter = new GPACounter();
		
		int aScoreKorean;
		int aScoreEnglish;
		int aScoreComputer;
		System.out.print("> 세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력하시오 : ");
		aScoreKorean = inputScore();
		aScoreEnglish = inputScore();
		aScoreComputer = inputScore();
		
		while ((aScoreKorean >= 0) && (aScoreEnglish >= 0) && (aScoreComputer >= 0))
		{
			if ((aScoreKorean > 100) || (aScoreEnglish > 100) || (aScoreComputer > 100))
			{
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			}
			else
			{
				student.setScoreKorean(aScoreKorean);
				student.setScoreEnglish(aScoreEnglish);
				student.setScoreComputer(aScoreComputer);
				
				System.out.println("[국   어] 점수 : " + student.scoreKorean() + ", 학점 : " + student.gradeKorean() + ",평점 : " + student.pointKorean());
				System.out.println("[영   어] 점수 : " + student.scoreEnglish() + ", 학점 : " + student.gradeEnglish()+ ",평점 : " + student.pointEnglish());
				System.out.println("[컴퓨터] 점수 : " + student.scoreComputer() + ", 학점 : " + student.gradeComputer()+ ",평점 : " + student.pointComputer());
				System.out.println("이 학생의 평균평점은 " + student.gpa() + " 입니다.");
				gpaCounter.count(student.gpa());
			}
			System.out.print("> 세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력하시오 : ");
			aScoreKorean = inputScore();
			aScoreEnglish = inputScore();
			aScoreComputer = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("평균평점이 3.0 이상인 학생은 " + gpaCounter.numberOfGPA3() + " 명입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 " + gpaCounter.numberOfGPA2() + " 명입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 " + gpaCounter.numberOfGPA1() + " 명입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 " + gpaCounter.numberOfGPA0() + " 명입니다.");
		System.out.println("프로그램을 종료합니다.");

	}

}
