// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    import java.util.Scanner;
    public class Person{
        public String name;
        private String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

    //getter
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    //setter setAddress(address:String):void
        public void setAddress(String address) {
        this.address = address;
    }
    //toString
    public String toString() {
        return"Person [name=" + name + ",address=" + address + "]";
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your address: ");
            String address = sc.nextLine();

            Person p = new Person(name, address);
            System.out.println(p.toString());

            System.out.println("Enter studnt program: ");
            String program = sc.nextLine();
            System.out.println("Enter student year: ");
            int year = sc.nextInt();
            System.out.println("Enter student fee: ");
            double fee = sc.nextDouble();
    
            Student s = new Student(name, address, program, year, fee);
            System.out.println(s.toString());

            System.out.println("Enter Staff's school: ");
            String SKIP = sc.nextLine();
            String school = sc.nextLine();
            System.out.println("Enter pay: ");
            double pay = sc.nextDouble(); sc.nextLine();

            Staff staff = new Staff(name, address, school, pay);
            System.out.println(staff.toString());


        sc.close();
    }
}
