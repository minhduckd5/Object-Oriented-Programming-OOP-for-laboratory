public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    //getter
    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }
    //setter void
    public void setSchool(String school) {
        this.school = school;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    //override toString
    @Override
    public String toString() {
        return "Staff [Person[name= "+getName()+", address= "+getAddress()+", school=" + school + ",pay=" + pay + "]";
    }
}
