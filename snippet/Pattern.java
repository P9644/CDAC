class Emp {
    String Employee_id;
    String Name;
    static String Company = "Cdac";
    Emp(String id, String name) {
        Employee_id = id;
        Name = name;
    }
    void display() {
	System.out.println(Employee_id + " " + Name + " " + Company);
    }
    static void Change() {
        Company = "Mumbai";
    }
}
public class Main {
    public static void main(String args[]) {
        Emp e1 = new Emp("P01", "XYZ");
        Emp e2 = new Emp("P02", "ABC");
        System.out.println("Before\n");
        e1.display();
        e2.display();
        Emp.Change();
        System.out.println("\nAfter\n");
        e1.display();
        e2.display();
    }
}