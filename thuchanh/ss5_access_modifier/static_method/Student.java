package module2.thuchanh.ss5_access_modifier.static_method;

public class Student {
    private int id;
    private String name;
    private static String college = "Hello";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    static void change(){
        college = "CodeGym";
    }


    public void display() {
        System.out.println(id+" "+name+" "+college);
    }
}
