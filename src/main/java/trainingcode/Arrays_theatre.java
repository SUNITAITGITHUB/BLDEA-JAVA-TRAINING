/*
 * 
 */
package trainingcode;
import java.util.Scanner;
public class Arrays_theatre {
	public static void main(String[] args) {  // TODO Auto-generated method stub 
		System.out.println("Enter the count of movie house:");		
		Scanner sc=new Scanner(System.in);
		int mov=sc.nextInt();
		System.out.println("Enter the count of theatre in each movie house:");
		int thr=sc.nextInt();
		System.out.println("Enter the count of screen in each theatre:");
		int scr=sc.nextInt();

		int arr[][][]=new int[mov][thr][scr];

		for(int i=0;i<arr[i].length;i++) {
			System.out.println("inside the theatre number"+(i+1));
			for(int j=0;j<arr[i].length;j++ ) {
				System.out.println("inside the theatre number"+(j+1));
				for(int k=0;k<arr.length;k++ ) {
					System.out.println("Enter the capacity of screen number:"+(k+1));
					
					arr[i][j][k]=sc.nextInt();
			}
		}
			}
		System.out.println("***************************");
		for(int i=0;i<arr[i].length;i++ ) {
			System.out.println("inside the movie house number:"+(i+1));
			for(int j=0;j<arr[i].length;j++ ) {
				System.out.println("inside the theatre number:"+(j+1));
				for(int k=0;k<arr.length;k++ ) {
					System.out.println("The fund collected from screen number:"+(k+1));
		int fund=arr[i][j][k];
		System.out.println("fund");
				}
			}
		}
		}
		

	

	

	}

}
