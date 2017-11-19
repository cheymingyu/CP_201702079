import java.util.Scanner;

public class HW09_2 {

	private static final int MAX_SIZE = 100;
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore () {
		int score;
		System.out.print(">������ �Է��Ͻÿ� : ");
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
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else
			{
				scores[numberOfStudents] = realScore;
				numberOfStudents ++;
			}
			realScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + numberOfStudents + " ���� ������ �ԷµǾ����ϴ�.");
		
		average = calcAverage (scores, numberOfStudents);
		System.out.println("����� " + average + " �Դϴ�.");
		System.out.println("");
		
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		int i = 0;
		while (i < numberOfStudents)
		{
			if ((double) scores[i] >= average)
			{
				System.out.println("[" + i + "] " + scores[i] + " (��� �̻��Դϴ�)");
				numberOfOverAverage ++;
			}
			else
			{
				System.out.println("[" + i + "] " + scores[i] + " (��� �̸��Դϴ�)");
			}
			i ++;
		}
		System.out.println("��� �̻��� �л��� ���� " + numberOfOverAverage + " �� �Դϴ�.");
		System.out.println("");
		
		maxScore = calcMax (scores, numberOfStudents);
		minScore = calcMin (scores, numberOfStudents);
		
		System.out.println("�ְ����� " + maxScore + " ���Դϴ�.");
		System.out.println("�������� " + minScore + " ���Դϴ�.");
		System.out.println("");
		System.out.println("�������� ������ �����ϴ�.");
		
		selectionSort (scores, numberOfStudents);
		
		int j = 0;
		while (j < numberOfStudents)
		{
			System.out.println("[" + j + "] " + scores [j]);
			j ++;
		}
		System.out.println("���α׷��� �����մϴ�.");

	}

}
