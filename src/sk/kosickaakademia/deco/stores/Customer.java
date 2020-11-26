package sk.kosickaakademia.deco.stores;

public class Customer extends Person {
    private Integer age;

    public Customer(String fname, String lname, Sex sex, Integer age) {
        super(fname, lname, sex);
        this.age=age;
    }

    @Override
    public void print() {
        System.out.println(getFname()+" "+getLname()+" "+getSex()+" "+age);
    }
}
