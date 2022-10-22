
import java.util.Scanner;
public class StaffMode {
	private int Size; // Size of content in movielist
	private Movie[] MovieList= new Movie[30]; //Create tempList to store and return
	Scanner sc = new Scanner(System.in);
	Display UI = new Display(); //display UI messages
	
	public void Adminmode(Movie[] movielist, int size){
		
		this.MovieList=movielist;
		int choice = 1; 
		//UI.staffdisplay();
		do {
			UI.staffdisplay();
			System.out.print("What is your choice:  ");
			choice = sc.nextInt();
			switch(choice) {
			case(1):
				System.out.println("*****Create Movie******");
				movielist[size]= CreateMovie();
				this.MovieList=movielist;
				size= size+1;
				this.Size=size;
				break;
			case(2):
				this.MovieList= UpdateMovie(movielist, size);
				break;
			case(3):
				System.out.println("Remove Movie");
				break;
			case(4):
				System.out.println("Change movie Ranking");
				break;
			case(5):
				System.out.println("Exit Admin Mode");
				choice =0;
				break;
			default:
				System.out.println("Invalid Choice");
				choice=1;
			
			}
				
		}while(choice != 0);
		
	}
	
	public Movie CreateMovie() {
		Movie temp= new Movie();
		String Input;
		int a;
		float b;
		Input=sc.nextLine(); //clear the previous sc.nextInt.
		System.out.println("Enter Title:");
		temp.assignTitle(Input=sc.nextLine());
		//System.out.println("Enter Movie Show Status (Now Showing, Coming Soon, TBC)");
		//temp.assignStatus(Input=sc.nextLine());
		//System.out.println("Enter Movie Description: ");
		//temp.assignSyn(Input=sc.nextLine());
		//System.out.println("Enter Movie Director: ");
		//temp.assignDirect(Input=sc.nextLine());
		//System.out.println("Enter Movie Main Cast: ");
		//temp.assignCast(Input=sc.nextLine());
		//System.out.println("Enter Movie Restriction (PG13,NC16,M18,TBC):");
		//temp.assignRestrict(Input=sc.nextLine());
		//System.out.println("Enter Movie Genre:");
		//temp.assignGenre(Input=sc.nextLine());
		//System.out.println("Enter Movie Run time");
		//temp.assignRuntime(Input=sc.nextLine());
		//System.out.println("Enter Movie total votes");
		//temp.assignVotes(a=sc.nextInt());
		//System.out.println("Enter Movie Rating");
		//temp.assignRate(b=sc.nextFloat());
		//System.out.println("Enter Movie Sales");
		//temp.assignSales(a=sc.nextInt());
		return temp;
	}
	public Movie[] UpdateMovie(Movie[] Data, int Size){
		int choice, sel, updateInt;
		float updatefloat;
		String updates;
		printMovies(Data, Size);
		System.out.println("Select Movie to update: ");
		sel=sc.nextInt();
		this.MovieList= Data;
		while(sel>Size) {
			System.out.println("Invalid Input");
			System.out.println("Select Movie to update: ");
			sel=(sc.nextInt());
		}
		sel=sel-1;
		do {
			System.out.println(Data[sel].getTitle());
			UI.updatedisplay();
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			if(0<choice && choice<10)
				System.out.println("Enter new updates: ");
			updates=sc.nextLine();// check input
			
			switch(choice) {
		
			case (1):
				Data[sel].assignTitle(updates=sc.nextLine());
				break;
			case (2):
				
				Data[sel].assignSyn(updates=sc.nextLine());
				break;
			case (3):
				
				Data[sel].assignDirect(updates=sc.nextLine());
				break;
			case (4):
				
				Data[sel].assignCast(updates=sc.nextLine());
				break;
			case (5):
				
				Data[sel].assignGenre(updates=sc.nextLine());
				break;
			case (6):
				
				Data[sel].assignRestrict(updates=sc.nextLine());
				break;
			case (7):
				
				Data[sel].assignRuntime(updates=sc.nextLine());
				break;
			case (8):
				
				Data[sel].assignRate(updatefloat=sc.nextFloat());
				break;
			case (9):
				
				Data[sel].assignVotes(updateInt=sc.nextInt());
				break;
			case (10):
				choice =0;
				break;
			default:
				choice = 1;
				break;
			}
		}while(choice!=0);
		
		return Data;
		
	}
	public int searchMovie(Movie movielist) {
		return 0;
	}
	public void RemoveMovie() {
		
	}
	public void MovieRanking() {
		
	}
	public Movie[] ReturnList() {
		
		return this.MovieList;
	}
	public int ReturnSize() {
		return this.Size;
	}
	public void printMovies(Movie[] data, int size) {
		int loop=0;
		while(loop<size) {
			System.out.println("Movie#"+(loop+1)+" "+ data[loop].getTitle());
			loop++;
		}
	}
}
