import java.util.ArrayList;
import java.util.Scanner;
public class Main {
        public static void pressAnyKey(){
            Scanner input = new Scanner(System.in);
            System.out.println("Press Enter to continue...!");
            input.nextLine();
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int option;
            ArrayList<Account> accountList = new ArrayList<>();
            do {
                System.out.println("1: Add account");
                System.out.println("2: Remove account");
                System.out.println("3. Edit account");
                System.out.println("4. Show account information");
                System.out.println("5. Exit ");
                System.out.print("Choose option from 1 to 5 : ");
                option  = input.nextInt();
                Account account = new Account();
                switch (option) {
                    case 1 -> {
                        System.out.println("======================= Enter your account information =====================");
                        System.out.print("Enter ID : ");
                        account.id = input.nextInt();
                        System.out.print("Enter name : ");
                        input.nextLine();
                        account.ownerName = input.nextLine();
                        System.out.print("Enter balance : ");
                        account.balance = input.nextInt();
                        accountList.add(account);
                    }
                    case 2 -> {
                        System.out.println("-=================== Remove Account ==================");
                        if(accountList.size()>0){
                            System.out.print("->> Enter the id : ");
                            int removeId = input.nextInt();
                            accountList.removeIf(account1 -> account1.id == removeId);
                            System.out.println("One account has removed..!");
                        }else {
                            System.out.println("You did not add any account yet! Please add account first..!");
                        }
                    }
                    case 3 -> {
                        System.out.println("-=================== Update your account ==================");
                        for (Account account2 : accountList) {
                            System.out.println("Enter account Id : ");
                            int id2 = input.nextInt();
                            if (account2.getId() == id2) {
                                System.out.println("Enter your account information");
                                System.out.print("Name : ");
                                input.nextLine();
                                account.ownerName = input.nextLine();
                                System.out.print("Balance : ");
                                account.balance = input.nextInt();
                                account2.setOwnerName(account.getOwnerName());
                                account2.setBalance(account.getBalance());
                            } else {
                                System.out.println("Can not Find Id in list=" + id2);
                            }
                            break;
                        }
                    }
                    case 4 -> {
                        int showOption;
                        boolean isshow = false;
                        do{
                            System.out.println("======================= Show Information =====================");
                            System.out.println("1. Ascending order (by ID )");
                            System.out.println("2. Descending order (by ID) ");
                            System.out.println("3. Descending order by balance ");
                            System.out.println("4. Exit..!");
                            System.out.print("Choose show option : ");
                            showOption = input.nextInt();
                            switch (showOption) {
                                case 1 -> {
                                    for (Account account1 : accountList) {
                                        System.out.println("-------------------------------------------------------");
                                        System.out.println(account1);
                                        System.out.println("-------------------------------------------------------");
                                        isshow = true;
                                    }
                                }
                                case 2 -> {
                                    System.out.println("-------------------------------------------------------");
                                    accountList.sort((Account o1, Account o2) -> o1.getId() - o2.getId());
                                    accountList.forEach((li) -> System.out.println("[Id:\t" + li.getId() +
                                            "  Name : " + li.getOwnerName() + "  Balance is : " + li.getBalance() + "]"));
                                    System.out.println("-------------------------------------------------------");
                                    isshow = true;
                                }
                                case 3 -> {
                                    accountList.sort((Account o1, Account o2) -> (int) (o1.getBalance() - o2.getBalance()));
                                    accountList.forEach((li) -> System.out.println("[Id:\t" + li.getId() +
                                            "  Name : " + li.getOwnerName() + " Balanc1" +
                                            "e is : " + li.getBalance() + "]"));
                                }
                            }
                            if(showOption!=4){
                                pressAnyKey();
                            }
                        }while (showOption!=4);
                    }
                    case 5 -> System.out.println("Exit the program..!");
                }
                pressAnyKey();
            }while(option!=5);
        }
    }
