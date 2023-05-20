package module2.thuchanh.ss5_access_modifier.static_method;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student student = new Student(1,"Cuong");
        student.display();
    }
}
