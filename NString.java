import java.util.*;
public class NString{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the infinite sequence: ");
      String seq = sc.nextLine().toLowerCase();
      Scanner sc1 = new Scanner(System.in);
      System.out.print("Enter the number of letters: ");
      int num = sc1.nextInt();
      int counter = 0;
      int totalNumberOfGs = 0;
      for(int i = 0; i < num;i++){
         String sub = seq.substring(counter,counter+1);
         if(sub.equals("g"))
            totalNumberOfGs +=1;
         if(counter == seq.length() - 1)
            counter = 0;
         else
            counter+=1;
      }
      System.out.println("Total number of g's is: " + totalNumberOfGs);
   
   }

}