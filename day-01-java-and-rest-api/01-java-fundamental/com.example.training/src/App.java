import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        CustomerService customerService = new CustomerService();

        List<Customer> customers;
        customerService.createCustomer("Budi Santoso", "budi@mail.com", "08123456789");
        customerService.createCustomer("Siti Aminah", "siti@mail.com", "08222222222");

        customers = customerService.getAllCustomers();
        int i = 1;
        for (Customer customer : customers){
            System.out.println(i + " - " + customer.getFullName() + " - "+ customer.getEmail() + " - " + customer.getPhoneNumber());
            i++;
        }
        
        System.out.println("====================");
        Customer cust = customerService.updateCustomerEmail(1L, "budiganteng@mail.com");

        customers = customerService.getAllCustomers();
        i = 1;
        for (Customer customer : customers){
            System.out.println(i + " - " + customer.getFullName() + " - "+ customer.getEmail() + " - " + customer.getPhoneNumber());
            i++;
        }

        System.out.println("====================");
        customerService.deleteCustomer(1L);

        i = 1;
        for (Customer customer : customers){
            System.out.println(i + " - " + customer.getFullName() + " - "+ customer.getEmail() + " - " + customer.getPhoneNumber());
            i++;
        }

        Customer cust1 = customerService.getCustomerById(2L);
        System.out.println("Customer Detail: ");
        cust1.getDisplayName();


    }
}
