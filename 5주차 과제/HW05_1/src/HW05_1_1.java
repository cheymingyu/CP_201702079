import java.util.Scanner;

public class HW05_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int score;
		
		System.out.print("성적을 입력하세요 : ");
		score = scanner.nextInt();
		
		while(score >= 0)
		{
			if(score > 100)
			{
				System.out.println("오류 : 최대점수 100을 넘었습니다.");
			}
			else
			{
				
			}
			System.out.print("성적을 입력하세요 : ");
			score = scanner.nextInt();
		}
		
		scanner.close();
	}

}
