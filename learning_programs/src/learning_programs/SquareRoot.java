
package learning_programs;

public class SquareRoot {

	public static void main(String[] args) {

		int num=15;
		double temp;
		double sr=num/2;   //16/2=8
		
		do {
			temp=sr;     //temp=8
			sr=(temp+(num/temp))/2;    //(8+(16/8)/2     5
		}
		while((temp-sr)!=0); {
			System.out.println("square of the number: "+sr);
		}
		
		
	}

}
