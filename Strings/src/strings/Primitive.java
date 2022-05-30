package strings;
import java.util.*;
public class Primitive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
		int x=sc.nextInt();
		
		if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) 
			System.out.println("* byte"); 
		if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) 
			System.out.println("* short"); 
		if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
			System.out.println("* int");
		if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) 
			System.out.println("* long"); 

	}
		
}
}