
// Program 3: Class with Constructor and Method
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student("John", 101);
        s.display();
    }
}
