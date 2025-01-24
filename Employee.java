
// Program 6: Inheritance Example
class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Alice", 50000, 10000);
        m.showDetails();
    }
}
