public class Student {
    private String name;
    private int age;
    private String id;
    private String rollNumber;
    private String grade;

    public Student(String name, int age, String id, String rollNumber, String grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", ID: " + id +
                ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}
