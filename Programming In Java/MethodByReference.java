class Person
{
	String name;
	Person(String name) 
	{
        	this.name = name;
    	}
}
public class MethodByReference
{
	static void changeName(Person person)
	{
        	person.name = "John";
 	}
	public static void main(String[] args)
	{
        	Person p = new Person("Alice");
        	changeName(p);
        	System.out.println(p.name); 
			System.out.println("Program Executed By: Daegna Mangu");
            System.out.println("ERP Id: 0251BCA069");
}
}
