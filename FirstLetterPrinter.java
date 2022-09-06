import java.util.Scanner;
public class FirstLetterPrinter {
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
		 String input = in.nextLine();
		 System.out.println(firstLetterPrinter(input));
		 }
		 static String firstLetterPrinter(String str) {
         String[] a1=str.split(" ");
         String out="";
         for(String i:a1)
         {
         out+=i.charAt(0);
		
         }
         return out;
		 }	
		}
