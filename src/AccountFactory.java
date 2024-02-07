public class AccountFactory {
    public static Account getAccount(String accountType){
        return switch (accountType) {
            case "SAVINGS" -> new SavingsAccount();
            case "CHECKING" -> new CheckingAccount();
            case "LOAN" -> new LoanAccount();
            case "INVESTING" -> new InvestingAccount();
            default -> new DefaultAccount();
        };
    }
}
