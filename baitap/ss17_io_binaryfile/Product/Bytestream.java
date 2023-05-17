package module2.baitap.ss17_io_binaryfile.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class Bytestream {

    private static final String FILE_PATH = "D:\\Codegym\\Module02\\A1222I1_Module02\\baitap\\ss17_io_binaryfile\\Products.data";

    static List<Product> myProducts = new ArrayList<>();

    static {
        Product p1 = new Product("004", "R2", "YAHAMA", 3500.6, "the thao");
        Product p2 = new Product("004", "R2", "YAHAMA", 45000.6, "the thao");
        Product p3 = new Product("004", "R2", "YAHAMA", 2500.6, "the thao");
        Product p4 = new Product("004", "R2", "YAHAMA", 7000.6, "the thao");
        Product p5 = new Product("004", "R2", "YAHAMA", 80000.6, "the thao");
        myProducts.add(p1);
        myProducts.add(p2);
        myProducts.add(p3);
        myProducts.add(p4);
        myProducts.add(p5);
    }

    public Bytestream() {
    }

    public static List<Product> getMyProducts() {
        return myProducts;
    }

    public static void setMyProducts(List<Product> myProducts) {
        Bytestream.myProducts = myProducts;
    }

    public static void writeObjectList() throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(myProducts);
        oos.flush();
        oos.close();
    }

    public static List<Product> readProductList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        myProducts = (List<Product>) ois.readObject();
        ois.close();

        return myProducts;
    }

    static void addProduct(Product product) {
        myProducts.add(product);
    }

    static Product findProductbyId(String id) {
        for (Product product : myProducts) {
            if (product.getId().equalsIgnoreCase(id.trim())) {
                return product;
            }
        }
        return null;

    }

}
