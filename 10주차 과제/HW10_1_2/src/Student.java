
public class Student {
	private int _score;
	
	public Student ()
	{
		this._score = 0;
	}
	public void setScore (int aScore)
	{
		this._score = aScore;
	}
	public int score ()
	{
		return this._score;
	}
	public char grade ()
	{
		if (this._score >= 90)
		{
			return 'A';
		}
		else if (this._score >= 80)
		{
			return 'B';
		}
		else if (this._score >= 70)
		{
			return 'C';
		}
		else if (this._score >= 60)
		{
			return 'D';
		}
		else
		{
			return 'F';
		}
		
	}
	public double grade2Point () 
	{
		char currentGrade = this.grade();
		
		switch (currentGrade)
		{
		case 'A' : return 4.0;
		case 'B' : return 3.0;
		case 'C' : return 2.0;
		case 'D' : return 1.0;
		default : return 0.0;
		}
	}

}
