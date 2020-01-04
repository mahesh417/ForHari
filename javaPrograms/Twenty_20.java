package javaPrograms;

import java.util.Scanner;

public class Twenty_20 {

	static int TotalOvers = 20;
	static int Wickets = 0;
	static int AllWickets = 10;
	static int totalballs = 6;
	static int totalScore = 0;
	static int Overs = 0;

	public static void main(String[] args) {
		m1();
		
		
		
		
		
		

	}

	public static void m1() {

		while (Overs < TotalOvers) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Over:");
			int Overs2 = sc.nextInt();

			System.out.println("TotalOvers:" + TotalOvers);
			int ReamianigOvers = TotalOvers - Overs2;

			System.out.println("ReamianigOvers:" + ReamianigOvers);
			Overs = Overs + Overs2;

			// public static void calculateSCore() {

			 for (int Overs1 = Overs; Overs1 < TotalOvers; Overs1++) {
				System.out.println("Runing Over:" + Overs1);
				for (int i = 1; i <= totalballs; i++) {
					Scanner a = new Scanner(System.in);
					System.out.println("Enter Ball Type:");
					String ballType = a.next();

					switch (ballType.toUpperCase()) {

					case "WI":
						totalballs++;
						System.out.println("Ball:" + i + " " + "RemainingBalls:" + totalballs);
						System.out.println(totalScore);
						break;

					case "N":
						totalballs++;
						System.out.println("Ball:" + i + " " + "RemainingBalls:" + totalballs);
						break;

					case "F":
						System.out.println("Ball:" + i + " " + "RemainingBalls:" + (totalballs - i));
						System.out.println("Enter runs in a ball");
						int RunsInBall = a.nextInt();
						totalScore = totalScore + RunsInBall;
						System.out.println("TotalScore:" + totalScore);
						System.out.println("Enter Wickets in ball" + " " + i);
						int wickets_in_over = a.nextInt();
						Wickets = Wickets + wickets_in_over;

						System.out.println("TotalWickets:" + Wickets);

						break;
					default:
						System.out.println("Match was Suspended due to Wheather effect:");
						break;
					}
					sc.close();
					a.close();
					if (Wickets >= AllWickets) {
						//System.out.println("All Out: Match was Finished");
						break;
					}
				}
				if (Wickets >= AllWickets) {
					//System.out.println("All Out: Match was Finished");
					break;
				}
			}
			if (Wickets >= AllWickets) {
				System.out.println("All Out: Match was Finished");
				break;
			}
			break;
		}
		

	}

}
