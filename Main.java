  class Laptop {
    String brand;
    String ram;
    void displayInfo() {
        System.out.println("Brand:"+brand+", RamGB:"+ram);
    }
}

    public class Main {
    public static void main(String[] args) {
    Laptop l1 = new Laptop();;
    l1.brand = "lenovo";
    l1.ram ="8GB";

    Laptop l2 = new Laptop();
    l2.brand = "hp";
    l2.ram ="16GB";

    l1.displayInfo();
    l2.displayInfo();
    }
}
