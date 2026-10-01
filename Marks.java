import java.util.Scanner;
public class Marks{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks");
    int marks=sc.nextInt();                   
    if (marks>90)
    {
        System.out.println("5star");
    }
    else if(marks>80)
    {
        System.out.println("4star");
    }
    else if(marks>70)
    {
        System.out.println("3star");
    }
    else if(marks>50)
    {
        System.out.println("avg student");

    }
    else
    {
        System.out.println("improve" );
    }
    }

}
