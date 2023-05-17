package module2.baitap.ss17_io_binaryfile.Product;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Bytestream bytestream = new Bytestream();

    void addProduct() {
        String id;
        String nameProduct;
        String Manufacturers; // hãng sản xuất
        double price;
        String other;

        System.out.println("Enter id :");
        id = sc.nextLine();
        System.out.println("enter nameProduct");
        nameProduct = sc.nextLine();
        System.out.println("Enter the Manufacturers");
        Manufacturers = sc.nextLine();
        System.out.println("Enter the price ");
        price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the other");
        other = sc.nextLine();

        Product myProduct = new Product(id, nameProduct, Manufacturers, price, other);

        Bytestream.addProduct(myProduct);
    }

    void listProduct() throws ClassNotFoundException, IOException {
        List<Product> myProducts = Bytestream.readProductList();
        for (Product product : myProducts) {
            System.out.println(product.toString());
        }
    }

    void findbyproduct() {
        System.out.println("enter the id find ");
        Product product = Bytestream.findProductbyId(sc.nextLine());
        if (product != null) {
            System.out.println(product.toString());
        } else {
            System.out.println("not Find");
        }
    }

    void Menu() throws IOException, ClassNotFoundException {
        int luachon = 0;
        while (true) {
            System.out.println("1.add product");
            System.out.println("2.Write File prodcut");
            System.out.println("3.Read File prodcut");
            System.out.println("4.find product by id ");
            System.out.println("5.Exit ");

            System.out.println("choice :");
            luachon = Integer.parseInt(sc.nextLine());

            switch (luachon) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    Bytestream.writeObjectList();
                    break;
                case 3:
                    listProduct();
                    break;
                case 4:
                    findbyproduct();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("nhap loi ");
                    break;
            }

        }

    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Menu m = new Menu();
        m.Menu();
    }

}