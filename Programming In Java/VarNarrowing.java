public class VarNarrowing{  
public static void main(String[] args){  
float fvalue=10.5f;  

int intvalue=(int)fvalue;
float testinttofloat=intvalue;
  
System.out.println("The floating value is "+fvalue);  
System.out.println("The Intergral value is "+intvalue);
System.out.println("The inttofloat value is "+testinttofloat);
System.out.println("Program Executed By: Daegna Mangu");
System.out.println("ERP Id: 0251BCA069");

int tempwrapper= Integer.parseInt(args[0]);
System.out.println("The value received from CommandLine and after conversion into int is     "+tempwrapper);

float tempwrapperfloat= Float.parseFloat(args[0]);
System.out.println("The value received from CommandLine and after conversion into float is     "+tempwrapperfloat);

double tempwrapperdouble= Double.parseDouble(args[0]);
System.out.println("The value received from CommandLine and after conversion into double is     "+tempwrapperdouble);
 
}
}
