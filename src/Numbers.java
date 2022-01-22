import java.util.*;
public class Numbers {

    public static int factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int factorial = 1;
        for (int x = 1; x <= a; x++)
        {
            factorial = factorial * x;
        }
        return factorial;
    }

    public static void testArmstrong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        int y,temp = b,sum = 0;
        while(temp>0)
        {
            y= temp%10;
            sum = sum + (y*y*y);
            temp/=10;
        }
        if(sum==b)
            System.out.println("The number is an Armstrong Number");
        else
            System.out.println("The number is not an Armstrong Number");
    }

    public static void testPalindrome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int c = sc.nextInt();
        int temp = c;
        int rev = 0 , rem;
        while(temp>0)
        {
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(c==rev)
        {
            System.out.println("The number is a Palindrome number");
        }
        else
            System.out.println("The number is not a Palindrome number");
    }

    public static void testPrime()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int d = sc.nextInt();
        int temp = 0;
        for(int z=1; z <= d; z++)
        {
            if (d % z == 0)
            {
                temp = temp+1;
            }
        }
        if(temp<3)
        {
            System.out.println("The number is a Prime number ");
        }
        else
            System.out.println("The number is not a Prime number");
    }


    public static void fibonacciSeries()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, sum;
        System.out.println("The Fibonacci series is :");
        for(int i = 1; i<=n ; i++)
        {
            System.out.print(+n1+",");
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nENTER YOUR CHOICE:\n1. Factorial\n2. Armstrong\n3. Palindrome\n4. Prime number\n5. Fibonacci series\n6. Exit");
            int n = sc.nextInt();

            switch(n)
            {
                case 1:
                    System.out.println("The factorial is "+factorial());
                    break;
                case 2:
                    testArmstrong();
                    break;
                case 3:
                    testPalindrome();
                    break;
                case 4:
                    testPrime();
                    break;
                case 5:
                    fibonacciSeries();
                    break;
                case 6:
                    System.out.println("Program exited.");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input!");

            }

        }

    }
}
