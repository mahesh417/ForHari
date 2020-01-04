package javaPrograms;

import java.util.Scanner;

public class Cricket_Score {

	static int Score = 0;

	static int TotalOvers = 0;
	static int TotalWicketsFallen = 0;
	static int overs = 0;

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		do {
			overs++;
			System.out.println("Started the Over:"+overs);
			System.out.println("Enter Score in this Over:");
			if(TotalWicketsFallen==10||TotalOvers==20) {
				break;
			}
			System.out.println("Enter Wickets in this over:");
			int WicketsinOver=in.nextInt();
			TotalWicketsFallen=TotalWicketsFallen+WicketsinOver;
			
		}
		while(TotalOvers<=20);
	in.close();
	}

}
