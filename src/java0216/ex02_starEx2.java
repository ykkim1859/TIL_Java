package java0216;

public class ex02_starEx2 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		System.out.print("\n=========\n\n");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}
