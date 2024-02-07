public class Main {
    public static void main(String[] args) {
        Account account = AccountFactory.getAccount("INVESTING");
        account.printAccountDetails();
    }
}