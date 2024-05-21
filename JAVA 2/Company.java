class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void calculateBonus() {
        System.out.println("Bonus calculation for employee: " + name);
        // Implement bonus calculation logic here
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for employee: " + name);
        // Implement performance report generation logic here
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String address, double salary, String jobTitle, String department) {
        super(name, address, salary, jobTitle);
        this.department = department;
    }

    public void manageProjects() {
        System.out.println(name + " is managing projects in the " + department + " department.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public void code() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Programmer", programmingLanguage);
    }
}

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "123 Main St", 80000, "Manager", "IT");
        Developer developer = new Developer("Alice Smith", "456 Oak St", 70000, "Developer", "Java");
        Programmer programmer = new Programmer("Bob Johnson", "789 Pine St", 75000, "Python");

        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProjects();
        manager.work();

        developer.calculateBonus();
        developer.generatePerformanceReport();
        developer.code();
        developer.work();

        programmer.calculateBonus();
        programmer.generatePerformanceReport();
        programmer.code();
        programmer.work();
    }
}