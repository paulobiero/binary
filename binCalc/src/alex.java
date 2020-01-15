import java.util.Scanner;
public class alex
{
private string disease=null;
 public static void main(String args[])
 {
 Scanner scanner=new Scanner(System.in);
 System.out.println("Enter the disease you have");
 disease=scanner.nextLine();
 switch(disease)
 {
 case "cholera":
 System.out.println("treating cholra will cost you 12000");
 break;
 case "TB":
 System.out.println("treating TB will cost you 12000");
 break;
 case "Malaria":
 System.out.println("treating Malaria will cost you 12000");
 break;
 }
 }
}
