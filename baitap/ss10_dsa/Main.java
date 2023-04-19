package A1222I1_Module02.baitap.ss10_dsa;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> arrTest = new MyList<>();
        arrTest.add(1);
        arrTest.add(2);
        arrTest.add(3);
        arrTest.add(4);
        arrTest.add(5);
        arrTest.add(6);
        arrTest.add(7);
        arrTest.add(8);
        System.out.println("Test Add Function");
        for (int i = 0; i < arrTest.size() ; i++) {
            System.out.println(arrTest.get(i));
        }
        System.out.println("Test Remove Function");
        int a = arrTest.remove(5);
        System.out.println(a);
        System.out.println("New Arr: ");
        for (int i = 0; i < arrTest.size() ; i++) {
            System.out.println(arrTest.get(i));
        }
        System.out.println("Test Clone: ");
        MyList<Integer> testClone = (MyList<Integer>) arrTest.clone();
        for (int i = 0; i < testClone.size(); i++) {
            System.out.println(testClone.get(i));
        }
    }
}
