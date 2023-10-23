class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("The Student is eating.");
    }
}

class Teacher extends Student {
    private String gender;

    public Teacher(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public String getgender() {
        return gender;
    }

    public void shouting() {
        System.out.println("The Teacher is female.");
    }

    @Override
    public void eat() {
        System.out.println("The Teacher is eating.");
    }
}

public class college {
    public static void main(String[] args) {
        try {
            Student Student = new Student("Student", 5);
            Teacher Teacher = new Teacher("Teacher", 3, "Female");

            // Polymorphism
            Student polyStudent = new Teacher("Poly Teacher", 2, "Golden Retriever");
            polyStudent.eat();

            // Encapsulation
            System.out.println("Name: " + Student.getName() + ", Age: " + Student.getAge());
            System.out.println("Name: " + Teacher.getName() + ", Age: " + Teacher.getAge() + ", gender: " + Teacher.getgender());

            // Data binding
            Student TeacherStudent = new Teacher("Teacher Student", 1, "Poodle");
            TeacherStudent.eat();

            // Inheritance
            Teacher.shouting(); 
        } catch(Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
