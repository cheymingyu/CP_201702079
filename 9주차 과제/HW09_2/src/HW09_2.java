import java.util.Scanner;

public class HW09_2 {

	private static final int MAX_SIZE = 100;
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore () {
		int score;
		System.out.print(">점수를 입력하시오 : ");
		score = scanner.nextInt();
		return score;
	}
	
	private static double calcAverage (int [] elements, int aSize) {
		int i = 0;
		int sumOfScores = 0;
		double average;
		
		while (i <= aSize)
		{
			sumOfScores = sumOfScores + elements [i];
			i ++;
		}
		average = (double) sumOfScores / (double) aSize;
		return average;
	}
	
	private static int calcMax (int [] elements, int aSize) {
		int i = 0;
		int max = elements [0];
		
		while (i < aSize)
		{
			if (max < elements [i])
			{
				max = elements [i];
			}
			else
			{
				
			}
			i ++;
		}
		return max;
	}
	
	private static int calcMin (int [] elements, int aSize) {
		int i = 0;
		int min = elements [0];
		
		while (i < aSize)
		{
			if (min > elements [i])
			{
				min = elements [i];
			}
			else
			{
				
			}
			i ++;
		}
		return min;
	}
	
	private static void selectionSort (int [] elements, int aSize) {
		int lastLoc = aSize - 1;
		int maxLoc;
		int maxValue;
		int curLoc;
		int temp;
		
		int selectionLoc = 0;
		
		while (selectionLoc < lastLoc)
		{
			maxLoc = selectionLoc;
			maxValue = elements [maxLoc];
			curLoc = selectionLoc + 1;
			
			while (curLoc <= lastLoc)
			{
				if (elements [curLoc] > maxValue)
				{
					maxLoc = curLoc;
					maxValue = elements [maxLoc];
				}
				else
				{
					
				}
				curLoc ++;
			}
			temp = maxValue;
			elements [maxLoc] = elements [selectionLoc];
			elements [selectionLoc] = temp;
			
			selectionLoc ++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = new int [MAX_SIZE];
		int realScore;
		int numberOfStudents = 0;
		double average;
		int numberOfOverAverage = 0;
		int maxScore;
		int minScore;
		
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
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("모두 " + numberOfStudents + " 명의 성적이 입력되었습니다.");
		
		average = calcAverage (scores, numberOfStudents);
		System.out.println("평균은 " + average + " 입니다.");
		System.out.println("");
		
		System.out.println("입력된 성적은 다음과 같습니다.");
		int i = 0;
		while (i < numberOfStudents)
		{
			if ((double) scores[i] >= average)
			{
				System.out.println("[" + i + "] " + scores[i] + " (평균 이상입니다)");
				numberOfOverAverage ++;
			}
			else
			{
				System.out.println("[" + i + "] " + scores[i] + " (평균 미만입니다)");
			}
			i ++;
		}
		System.out.println("평균 이상인 학생의 수는 " + numberOfOverAverage + " 명 입니다.");
		System.out.println("");
		
		maxScore = calcMax (scores, numberOfStudents);
		minScore = calcMin (scores, numberOfStudents);
		
		System.out.println("최고점은 " + maxScore + " 점입니다.");
		System.out.println("최저점은 " + minScore + " 점입니다.");
		System.out.println("");
		System.out.println("성적순은 다음과 같습니다.");
		
		selectionSort (scores, numberOfStudents);
		
		int j = 0;
		while (j < numberOfStudents)
		{
			System.out.println("[" + j + "] " + scores [j]);
			j ++;
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
