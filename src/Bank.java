import java.util.*;
public class Bank {
    static float balance;
    public static void CreateAccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR DETAILS:");
        System.out.println("Enter your Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Address:");
        String address = sc.nextLine();
        System.out.println("Enter your Mobile Number:");
        String mobno = sc.nextLine();
        System.out.println("Enter your Age:");
        String age = sc.nextLine();
        System.out.println("Your account has been succesfully created.");
    }
    public static void Deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposited: Rs ");
        balance = sc.nextFloat();
    }
    public static void Withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn: Rs ");
        float withdrawamt = sc.nextFloat();
        if (withdrawamt>balance)
        {
            System.out.println("ERROR: Insufficient Balance!");
        }
        else balance = balance - withdrawamt;
    }

    public static double ComputeInterest(int time)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rate of Interest");
        double rate = sc.nextDouble();
        return (balance*rate*time)/100;
    }

    public static void Display(){
        System.out.println("Your current balance is Rs "+balance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String op;
        do {
            System.out.println("ENTER YOUR CHOICE:\n 1.Create Account\n 2.Deposit\n 3.Withdraw\n 4.Compute Interest\n 5.Display Balance");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    CreateAccount();
                    System.out.println("Enter 'y' to continue. Else, enter any key to terminate!");
                    op = sc.next();
                    break;
                case 2:
                    Deposit();
                    System.out.println("Enter 'y' to continue. Else, enter any key to terminate!");
                    op = sc.next();
                    break;
                case 3:
                    Withdraw();
                    System.out.println("Enter 'y' to continue. Else, enter any key to terminate!");
                    op = sc.next();
                    break;
                case 4:
                    System.out.println("Enter time period:");
                    int time = sc.nextInt();
                    System.out.println("Interest ="+ComputeInterest(time));
                    System.out.println("Enter 'y' to continue. Else, enter any key to terminate!");
                    op = sc.next();
                    break;
                case 5:
                    Display();
                    System.out.println("Enter 'y' to continue. Else, enter any key to terminate!");
                    op = sc.next();
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    System.out.println("Enter 'y' to continue. Else, enter any key to terminate!");
                    op = sc.next();
                    break;
            }
        }while (Objects.equals(op, "y"));
    }
}




