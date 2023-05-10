package module2.baitap.school_test;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Phùng Huy Cường", "Nha Trang");
        s1.addCourseGrade("MAE", 97);
        s1.addCourseGrade("MAD", 68);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());
        Teacher t1 = new Teacher("Võ Việt Hoàng", "Quảng Bình");
        System.out.println(t1);
        String[] courses = {"MAS", "MAA", "MAB"};
        for (String course : courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }
        for (String course : courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }
    }
}
