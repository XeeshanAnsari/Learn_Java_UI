package third_class;
import java.util.Scanner;
public class third_class {
	
   public static void main(String ar[])
   {
	   Scanner obj=new Scanner(System.in);
	   int sal,b;
	  System.out.println("Enter you salary");
	  sal=obj.nextInt();
	  if(sal>=10000)
	  {
		  b=(sal*10)/100;
		  sal=sal+b;  
      }
	  System.out.println("salary iS  "+sal);  
   }
   
}
