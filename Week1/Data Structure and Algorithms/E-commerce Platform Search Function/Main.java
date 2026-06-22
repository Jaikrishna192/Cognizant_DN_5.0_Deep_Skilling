public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        SearchDemo search = new SearchDemo();

        int searchId = 104;

        Product result1 = search.linearSearch(products, searchId);

        System.out.println("Linear Search Result:");
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found");
        }

        Product result2 = search.binarySearch(products, searchId);

        System.out.println("\nBinary Search Result:");
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found");
        }
    }
}