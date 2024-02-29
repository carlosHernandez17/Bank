import java.util.*;

public class Administrator extends People implements IOperationAdministrator {
    // Constructor
    public Administrator(String bankName, String address, String contact,
                         ArrayList<Customer> clients, ArrayList<Loan> loans,
                         ArrayList<SavingsAccount> savingsAccount, ArrayList<CurrentAccount> currentsAccount,
                         ArrayList<DebitCard> debitsCard,
                         String name, String lastName, String ID, String address1, String contact1) {
    }

    public void performAdministratorOperation() {
        // Implementa la lógica específica para operaciones de administrador
        System.out.println("Performing administrator operation");
    }

    @Override
    public void registerCustomers() {

    }

    @Override
    public void removeCustomers() {

    }

    @Override
    public void createSavingsAccount() {

    }

    @Override
    public void createCurrentAccount() {

    }

    @Override
    public void createDebitCard() {

    }

    @Override
    public void createCreditCard() {

    }

    @Override
    public void createLoan() {

    }
}
