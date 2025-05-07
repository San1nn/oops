import java.util.Scanner;

class Product {
    int pcode, price;
    String pname; 

    Product(int code, String name, int pr) {
        pcode = code;
        pname = name;
        price = pr;
    }
}

public class Productt {
    public static void main(String[] args) {
        Product productt = new Product(101, "crayon", 45);
        int pcode, price;
        String pname;

        pcode = 102;
        pname = "sketch";
        price = 50;
        Product Product2 = new Product(pcode, pname, price);

        Scanner sc = new Scanner(System.in);
        System.out.println("Print product code:");
        pcode = sc.nextInt();
        sc.nextLine();  // Consume the newline
        System.out.println("Print product name:");
        pname = sc.nextLine();
        System.out.println("Print product price:");
        price = sc.nextInt();
        Product Product3 = new Product(pcode, pname, price);

        System.out.println("\nProduct 1:");
        System.out.println("pcode: " + productt.pcode);
        System.out.println("pname: " + productt.pname);
        System.out.println("price: " + productt.price);

        System.out.println("\nProduct 2:");
        System.out.println("pcode: " + Product2.pcode);
        System.out.println("pname: " + Product2.pname);
        System.out.println("price: " + Product2.price);

        System.out.println("\nProduct 3:");
        System.out.println("pcode: " + Product3.pcode);
        System.out.println("pname: " + Product3.pname);
        System.out.println("price: " + Product3.price);

        System.out.println("\nProduct having the lowest price:");

        if (productt.price < Product2.price && productt.price < Product3.price) {
            System.out.println("\npcode: " + productt.pcode);
            System.out.println("pname: " + productt.pname);
            System.out.println("price: " + productt.price);
        } else if (Product2.price < productt.price && Product2.price < Product3.price) {
            System.out.println("\npcode: " + Product2.pcode);
            System.out.println("pname: " + Product2.pname);
            System.out.println("price: " + Product2.price);
        } else {
            System.out.println("\npcode: " + Product3.pcode);
            System.out.println("pname: " + Product3.pname);
            System.out.println("price: " + Product3.price);
        }
    }
}

