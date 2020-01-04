package javaPrograms;

import java.util.Scanner;

public class Cricket_Scroe2 {

	public static void main(String[] args) {
		
		int Pak=150;
		int Ind=0;
		Scanner sc= new Scanner(System.in);
		int overs=0;
		int totalfallenwickets=0;
		do{
			overs++;
			System.out.println("started the over:"+overs);
			System.out.println("Enter score in this over");
			
			if(totalfallenwickets == 10||overs==20) {
			break;
			}
			int score_Ind=sc.nextInt();
			Ind=Ind+score_Ind;
			System.out.println("enter wickets in this over:");
			int wickets_in_over=sc.nextInt();
			totalfallenwickets=totalfallenwickets+wickets_in_over;
			System.out.println("target:"+(Pak+1)+'\n'+"current score:"+Ind+"/"+totalfallenwickets+'\n'+overs+'\n'+"TotalRequired:"+((Pak+1)-Ind));
			
		}

		while(Pak>Ind);
		sc.close();
	}
}
