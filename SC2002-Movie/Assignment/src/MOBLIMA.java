import java.util.Scanner;

public class MOBLIMA {
	Display UI = new Display();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Display UI = new Display();
		Operation Ops = new Operation();
		Movie movies = new Movie();
		//create array of Movie to store
		int choice =0;
		int check;
		do {
			UI.maindisplay();
			System.out.print("What is your choice:  ");
			choice= Integer.parseInt(sc.nextLine());
			switch(choice) {
				case 1:
					Ops.viewMovie();
					break;
				case 2:
					Ops.SearchMovie();
				case 3:
					System.out.println("View Show Time and Cinema");
				case 4:
					System.out.println("Order History");
					break;
				case 5:
					Ops.runAdminLogin();
					break;
				case 6:
					System.out.println("Thanks for using MOBLIMA");
					choice =0;
					break;
				default:
					System.out.println("Wrong input");
					break;
			}
		}while(choice!=0);
	}


}





		









