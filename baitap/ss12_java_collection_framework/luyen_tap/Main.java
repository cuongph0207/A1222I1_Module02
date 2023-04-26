package module2.baitap.ss12_java_collection_framework.luyen_tap;

public class Main {
    public static void main(String[] args) {
        ProductManager p1 = new ProductManager();
        p1.addProduct(new Product(1, "Phung", 123));
        p1.addProduct(new Product(4, "Huy", 1232));
        p1.addProduct(new Product(3, "Cuong", 1332));
//          p1.showList();
//          p1.sortList();
        p1.showlist();
        p1.sortlist();
    }
}
