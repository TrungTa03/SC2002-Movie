import java.util.Scanner;

import java.util.InputMismatchException;
public class MOBLIMA {
	Display UI = new Display();

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Display UI = new Display();
		Operation Ops = new Operation();
		Movie[] movies;
		SeatsLayOut hi= new SeatsLayOut();
		Showtime time= new Showtime();
		Cineplex[] cinema;
		//SystemConfig config= new SystemConfig();
		//create array of Movie to store
		int choice = 1;
		int check;
		do {
			try {
			UI.maindisplay();
			System.out.print("What is your choice:  ");
			choice= Integer.parseInt(sc.nextLine());
			//SeatsLayOut hi= new SeatsLayOut();
			
			switch(choice) {
				case 1:
					Ops.viewMovie();
					break;
				case 2:
					Ops.SearchMovie();
					break;
				case 3:
					Ops.runCinema();
					break;
					//System.out.println("View Show Time and Cinema");
				case 4:
					System.out.println("Order History");
					break;
				case 5:
					Ops.runAdminLogin();
					break;
				case 0:
					System.out.println("Thanks for using MOBLIMA");
					break;
				default:
					System.out.println("Wrong input");
					break;
			}}
			catch(Exception e) {
				System.out.println("Invalid Input");
			}
			
		}while(choice!=0);
		
	}


}





		









