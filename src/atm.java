import java.util.Scanner;

public class atm {
        private int addAmount;
        private int withDrawAmount;
        private int checkBalance;
        private int balance=100000;
        private String Username;
        private int passCode;
        Scanner sc=new Scanner(System.in);
        public atm(String name,int code){
                Username=name;
                passCode=code;

        }

        public int getAddAmount() {
                System.out.println("Enter the amount to be credit:");
                addAmount=sc.nextInt();
                balance +=addAmount;
                System.out.println("Amount credited Successfully!!");
                return addAmount;
        }

        public int getWithDrawAmount() {
                System.out.println("Enter the amount to be Debit:");
                withDrawAmount=sc.nextInt();
                balance-=withDrawAmount;
                System.out.println("Amount debited successfully");
                return withDrawAmount;
        }

        public int getCheckBalance() {
                System.out.println("balance is :"+balance);
                return balance;
        }
        public void printReceipt(){
                System.out.println("Credited Amount:"+ addAmount);
                System.out.println("Debited Amount:"+ withDrawAmount);
                System.out.println("Available Balance:"+ balance);
        }
        public void displayDetails() {
                System.out.println("Enter User Name:");
                String name = sc.nextLine();
                System.out.println("Enter pin number:");
                int pin = sc.nextInt();
                if (name == Username || pin == passCode) {


                        while (true) {
                                System.out.println("Enter the number 1 to 5:");

                                System.out.println("1.Credit Amount");
                                System.out.println("2.Debit Amount");
                                System.out.println("3.Check balance");
                                System.out.println("4.Print Receipt");
                                System.out.println("5.Exit");
                                int opt = sc.nextInt();
                                if (opt == 1) {
                                        getAddAmount();

                                } else if (opt == 2) {

                                        getWithDrawAmount();

                                } else if (opt == 3) {
                                        getCheckBalance();
                                } else if (opt == 4) {
                                        printReceipt();
                                } else if (opt == 5) {
                                        System.out.println("Thank you!!");
                                        break;
                                }

                        }
                }else {
                        System.out.println("You have Entered the wrong pin");
                }
        }
}

