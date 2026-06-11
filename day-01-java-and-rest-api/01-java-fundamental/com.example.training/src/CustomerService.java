import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    private Map<Long, Customer> customerStorage = new HashMap<>();
    private Long sequence = 1L;

    public Customer createCustomer(String fullName, String email, String phoneNumber){
        if (fullName == null){
            System.out.println("Nama tidak boleh kosong");
            return null;
        }
        Customer newCustomer = new Customer(sequence, fullName, email, phoneNumber);
        customerStorage.put(sequence, newCustomer);
        sequence++;
        return newCustomer;
    }  

    public Customer getCustomerById(Long id){
        Customer customer = customerStorage.get(id);
        return customer;
    }

    public Customer updateCustomerEmail(Long id, String email){
        Customer customer = getCustomerById(id);
        customer.setEmail(email);
        return customer;
    }

    public void deleteCustomer(Long id){
        customerStorage.remove(id);
    }

    public List<Customer> getAllCustomers(){
        return new ArrayList<>(customerStorage.values());
        
    }

    
}