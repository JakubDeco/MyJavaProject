package sk.kosickaakademia.deco.stores;

public abstract class Person implements Info{
    private String fname;
    private String lname;
    private Sex sex;


    public Person(Sex sex) {
        this.sex = sex;
    }
    public Person(String fname, Sex sex) {
        this.fname = fname;
        this.sex = sex;
    }

    public Person(String fname, String lname, Sex sex) {
        this(fname,sex);
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        System.out.println(fname+" "+lname+" "+sex);
    }
}
