import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        System.out.println("If..else Statement : ");
        if(n>0)
        {
            System.out.println("Positive");
        }
        else if(n<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
        System.out.println("Switch Statement : ");
        switch(n)
        {
            case 0:
            {
                System.out.println("Sunday");
                break;
            }
            case 1:
            {
                System.out.println("Monday");
                break;
            }
            case 2:
            {
                System.out.println("Tuesday");
                break;
            }
            case 3:
            {
                System.out.println("Wednesday");
                break;
            }
            case 4:
            {
                System.out.println("Thursday");
                break;
            }
            case 5:
            {
                System.out.println("Friday");
                break;
            }
            case 6:
            {
                System.out.println("Saturnday");
                break;
            }
        }
        System.out.println("For Loop :");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
        System.out.println("While Loop :");
        while(n!=0)
        {
            System.out.println(n);
            n--;
        }
        System.out.println("Do...While Loop :");
        do{
            System.out.println(m);
            m--;
        }
        while(m!=1);
    }
}