import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class LAB_4 {

    static int acc_no = 111222333;
    
    static String hname = "Aakash";
    static double bal = 1230000.00;
    
    
    static String[] transaction(String [] transaction,int count){
        System.out.println("Transction details are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(transaction[i]);
        }
        return transaction;
    }
    static double deposit(double bal,int count,String []transaction){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit the money: ");

        double temp = sc.nextDouble();
        double prev= bal;
        bal += temp;
        transaction[count]="Money deposit : "+temp+" Time "+java.time.LocalTime.now()+" Previous bal: "+prev+" New bal"+bal;
        // count++;

        return bal;
    }
    static double with(double bal,int count,String[] transaction){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw the money: ");
        double temp = sc.nextDouble();
        double prev= bal;
        bal -= temp;
        transaction[count]="Money Withdraw : "+temp+" Time "+java.time.LocalTime.now()+" Previous bal: "+prev+" New bal"+bal;
        // count++;
        return bal;

    }
    static void summary(){
        System.out.println("welcome "+hname);
        System.out.println("Current Login Time: "+java.time.LocalTime.now());
        System.out.println(" Your Account number is "+acc_no);
        System.out.println("Yout total account balance is :"+bal);

    }

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        String [] transaction = new String[200];
        int count=0;

        do {
            
        System.out.println("- - - - - - - - - MENU - - - - - - - - -");
        System.out.println(" 1. Deposit Money ");
        System.out.println(" 2. Withdraw Money ");
        System.out.println(" 3. Print All the transctions. ");
        System.out.println(" 4. Print Account Summary.");
        System.out.println(" 5. Logout. ");
        System.out.println("- - - - - - - - - - - - - - - - - -");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                bal=deposit(bal,count,transaction);
                count++;
                break;
            case 2:
                bal=with(bal,count,transaction);
                count++;
                break;
            case 3:
                transaction=transaction(transaction,count);

                break;
            case 4:
                summary();
                break;
            case 5:
                System.out.println("Thanks for visiting....!!!");
                flag=false;
                break;
        }
        } while (flag);
        
    }
}

    



    
