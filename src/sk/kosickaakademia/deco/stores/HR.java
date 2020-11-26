package sk.kosickaakademia.deco.stores;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HR {
    public static void main(String[] args) {
        Set<Customer> customers=new HashSet<>();
        List<Employee> employees=new ArrayList<>();

        customers.add(new Customer("Adam","Sotar",Sex.MALE,25));
        customers.add(new Customer("Petra","Kolacka",Sex.FEMALE,21));
        customers.add(new Customer("Adam","Sotar",Sex.MALE,45));
        customers.add(new Customer("Adam","Sotar",Sex.MALE,12));
        customers.add(new Customer("Adam","Sotar",Sex.MALE,36));
        customers.add(new Customer("Adam","Sotar",Sex.MALE,75));
        customers.add(new Customer("Adam","Sotar",Sex.MALE,75));

        print(customers);
    }

    private static void print(Set<Customer> customers) {
        for (Customer help : customers) {
            help.print();
        }
    }

    //remove person
    //add person
    //printPersonOf Sex
    //update
}
