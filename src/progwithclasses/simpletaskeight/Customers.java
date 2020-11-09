package progwithclasses.simpletaskeight;

import java.util.Arrays;
import java.util.Comparator;

public class Customers {

    private Customer[] customers;

    public Customers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer[] sortBySurname(){
        Customer[] sortcust = customers.clone();
        Arrays.sort(sortcust, new SortBySurname());
        return sortcust;
    }

    private static class SortBySurname implements Comparator<Customer> {
        public int compare(Customer a, Customer b){
            String customerFirst = a.getSurname();
            String customerSecond = b.getSurname();
            return customerFirst.compareTo(customerSecond);
        }
    }

    public Customer[] rangeCardNumber(long lower_limit, long upper_limit){
        int count = 0;
        for (Customer cust: customers) {
            if(lower_limit < cust.getCard_number() && cust.getCard_number() < upper_limit){
                count++;
            }
        }
        Customer[] custs = new Customer[count];
        if(count != 0){
            int i = 0;
            for(Customer cust: customers){
                if(lower_limit < cust.getCard_number() && cust.getCard_number() < upper_limit){
                    custs[i] = cust;
                    i++;
                }
            }
        }
        return custs;
    }
}
