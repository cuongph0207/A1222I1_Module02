package module2.baitap.ss5_access_modifier.xay_dung_lop_chi_ghi;


public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("old name :" + st.getName());
        System.out.println(" old classes :" + st.getClasses());
        st.setName("Cường");
        st.setClasses("A122201");
        System.out.println("new Name :" + st.getName());
        System.out.println("new classes :" + st.getClasses());


    }
}
