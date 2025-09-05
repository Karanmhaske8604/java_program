import java.util.Scanner;
public class Reactangle 
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int area,perimeter;
    System.out.println("Enter the length:-");
    int length=sc.nextInt();
    System.out.println("Enter the breadth:-");
    int breadth=sc.nextInt();
    area=length*breadth;
    perimeter=2*(length*breadth);
    System.out.println("The area of Reactangle:-"+area);
    System.out.println("the perimeter of Reactangle:-"+perimeter);
    }    
}
