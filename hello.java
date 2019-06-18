import java.util.*;
class hello{


public static void main(String args[]){
    System.out.println("Hello");
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