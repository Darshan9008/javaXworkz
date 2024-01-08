package learning_programs;

import java.util.ListIterator;

public class FreqeuncyOwn {

	public static void main(String[] args) {


		String str="abcabcbbac";
		char ch='a';
		int count=0;
		char ch1='b';
		int count1=0;
		
		char ch2='c';
		int count3=0;
		
		char[] ch3=str.toCharArray();
		for(int i=0;i<ch3.length;i++) {
			if(ch==ch3[i]) {
				count++;
			}else
				if(ch1==ch3[i]) {
					count1++;
					
				}
				else
					if(ch2==ch3[i]) {
						count3++;
					}
			
		}
		
		System.out.println(ch+"-"+count);
		System.out.println(ch1+"-"+count1);
		System.out.println(ch2+"-"+count3);
		

		
		
	}

}
