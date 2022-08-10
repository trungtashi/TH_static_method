public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1,"Thor");
        Student s2 = new Student(2, "Captain America");

        s1.display();
        s2.display();
    }
}
