import java.util.*;
public class Main
{
	public static void Number-check(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a==0){
		    System.out.println("zero");
		}
		else if(a>0){
		    System.out.println("positive data");
		}else{
		    System.out.println("Negative data");
		}
	}
}
