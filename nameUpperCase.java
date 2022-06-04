// program to uppercase the 1st letter of name 

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name : ");
    String name = sc.nextLine();
    String names[] = name.split(" ");
    String fullName = "";
    for(String x: names){

        String n = String.valueOf(x.charAt(0)).toUpperCase()+x.substring(1).toLowerCase();
        fullName+=n+" ";
    }
    System.out.println(fullName);
    sc.close();

    }
}
 
