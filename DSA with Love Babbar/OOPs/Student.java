package OOPs;

public class Student {
    int id;
    int roll;
    String name;
    int age;



    // Parameterized constructor
    public Student(int id, int roll, String name, int age) {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Student(Student st) {
        this.id = st.id;
        this.roll = st.roll;
        this.name = st.name;
        this.age = st.age;
    }
}
