package learning_programs;
import java.util.ArrayList;
import java.util.HashSet;
public class RemoveDuplicate {
	
	
	public static void main(String[] args) {
		
		
      ArrayList<String> listWithDuplicate=new ArrayList<String>();
      listWithDuplicate.add("darshan");
      listWithDuplicate.add("vinay");
      listWithDuplicate.add("chandan");
      listWithDuplicate.add("darshan");
      listWithDuplicate.add("vinay");
      listWithDuplicate.add("chandan");
      
      System.out.println("list with duplicate elements");
      System.out.println(listWithDuplicate);
      
      HashSet<String> set=new HashSet<String>(listWithDuplicate);
      
      ArrayList<String> listwithNoDuplicate=new ArrayList<String>(set);
      
      System.out.println("list with no duplicate");
      
      System.out.println(listwithNoDuplicate);	
	}
	

}
