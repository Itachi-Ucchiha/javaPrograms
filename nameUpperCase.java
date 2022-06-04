// program to uppercase the 1st letter of name 


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the id: ");
    int id =sc.nextInt();
    sc.nextLine();
    System.out.println("enter your name : ");
    String name = sc.nextLine();
    
    String names[] = name.split(" ");
    String fullName = "";
    for(String x: names){
        
        String n = String.valueOf(x.charAt(0)).toUpperCase()+x.substring(1).toLowerCase();
        fullName+=n+" ";
    }
    System.out.println("Enter the age: ");
    int age = sc.nextInt();
    System.out.println("Enter the Salary: ");
    int salary = sc.nextInt();

    // ------- To beautify the salary slip ---------------------
        
    Locale locale = new Locale("en","US");
    NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
    String formatSalary = nf.format(salary);
        
    // --------------------------------------------
        
        
      // displaying dates in java
    Date date = new Date();
 

    //  Dateformat calll from util ....works same as Numberformat
    //  2 main styles = DateFormat.SHORT and DateFormat.LONG
    DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
    String formattedDate = df.format(date);     //// format method of DateFormat class
    System.out.println("the date is : "+formattedDate); 
        
     //--------------------------------------------------

    System.out.println("id is: "+id);
    System.out.println("welcome: " + fullName);
    System.out.println("age is "+age);
    System.out.println("salary is " +formatSalary);

    sc.close();

    }
}
 
 
