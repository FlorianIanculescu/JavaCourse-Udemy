public class Main {

    public static void main(String[] args) {

        System.out.println("-".repeat(40));
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
        System.out.println("Balance on account is " + timsAccount.getBalance());

//        System.out.println("-".repeat(40));
//        timsAccount.balance = 5000;
//        System.out.println("Balance on account is " + timsAccount.getBalance());
//
//        System.out.println("-".repeat(40));
//        timsAccount.transactions.add(4500);
//        timsAccount.calculateBalance();
    }
}