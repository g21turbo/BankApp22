public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of America");

        bank.addBranch("Los Angeles");
        bank.addCustomer("Los Angeles", "Bob",250.00);
        bank.addCustomer("Los Angeles", "John",750.00);
        bank.addCustomer("Los Angeles", "Bill",50.00);

        bank.addCustomerTransaction("Los Angeles", "Bob", 8004.00);
        bank.addCustomerTransaction("Los Angeles", "John", 140.00);
        bank.addCustomerTransaction("Los Angeles", "Bill", 502.00);


        bank.addBranch("San Francisco");
        bank.addCustomer("San Francisco", "Jill",125.00);
        bank.addCustomer("San Francisco", "Jane",65.00);
        bank.addCustomer("San Francisco", "Joan",700.00);

        bank.addCustomerTransaction("San Francisco", "Jill", 800.00);
        bank.addCustomerTransaction("San Francisco", "Jane", 1400.00);
        bank.addCustomerTransaction("San Francisco", "Joan", 50.00);

        bank.listCustomers("Los Angeles", false);
        bank.listCustomers("San Francisco", true);

    }



}
