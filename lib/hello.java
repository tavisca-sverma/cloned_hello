import java.util.*;

// Author: suraj verma (sverma@tavisca.in)
class hello{

//has greet message at begin
public static void main(String args[]){
    System.out.println("Just to greet You. Have a Good day !");
     System.out.println("You are doing awesome! ");
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to check it's parity>>");
    number=sc.nextInt();
    if(number%2==0)
    System.out.println("The number is Even!");
    else
    System.out.println("The number is Odd!");
}

}