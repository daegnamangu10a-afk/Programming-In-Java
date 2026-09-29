public class MultiSwitch
{
  public static void main(String[]args){
     String day = "SATURDAY";
     switch (day) {
       case "MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY" ->
          System.out.println("Weekday");
       case "SATURDAY" , "SUNDAY" ->
          System.out.println("Weekend");
      }
          System.out.println("Program Executed By: Daegna Mangu");
          System.out.println("ERP Id: 0251BCA069");
   }
}