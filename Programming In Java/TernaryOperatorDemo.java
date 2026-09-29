public class TernaryOperatorDemo
{
  public static void main(String[] args)
   {
     int number = 10;
    
     String result = (number % 2 == 0) ? "Even" : "Odd" ;

     System.out.println("The number" + number + " is: " +result);

     int a = 25;
     int b = 40;

     int max = (a > b) ? a : b;
   
     int age = 16;
     String category = (age >=18) ? "Adult" : (age >= 13) ? "Teenager" : "Child";
     
     System.out.println("The person is classified as: " +  category);
     System.out.println("Program Executed By: Daegna Mangu");
     System.out.println("ERP Id: 0251BCA069");
   }
}