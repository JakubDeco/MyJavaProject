package sk.kosickaakademia.deco.stores;

import java.util.Date;

public class Employee extends Person{
    private Date dob;

    public Employee(String fname, String lname, Sex sex,Date dob) {
        super(fname, lname, sex);
        this.dob=dob;
    }

    @Override
    public void print() {
        System.out.println(getFname()+" "+getLname()+" "+getSex()+" "+dob);
    }
}
