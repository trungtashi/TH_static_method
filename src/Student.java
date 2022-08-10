public class Student {
    private int rol;
    private  String name;
    private static String college = "BBDIT";

    Student(int rol, String name){
        this.rol = rol;
        this.name = name;
    }
    static void change(){
        college = "Avengers";
    }
    void display(){
        System.out.println(rol + " " + name + " " + college);
    }
}