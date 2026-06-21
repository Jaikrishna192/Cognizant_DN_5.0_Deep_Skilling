import java.util.Arrays;
 
class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;
 
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
 
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }
 
    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }
}
 
public class EcommerceSearch {
 
    public static Product linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return products[i];
            }
        }
        return null;
    }
 
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;
 
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
 
    public static void main(String[] args) {
        Product[] productList = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(101, "Running Shoes", "Footwear"),
            new Product(104, "Coffee Mug", "Kitchen"),
            new Product(102, "Leather Wallet", "Accessories"),
            new Product(103, "Desk Lamp", "Furniture"),
            new Product(119, "Bluetooth Headphones", "Electronics")
        };
 
        int searchId = 104;
 
        System.out.println("--- Testing Linear Search ---");
        Product result1 = linearSearch(productList, searchId);
        System.out.println("Product found: " + result1);
 
        System.out.println("\n--- Testing Binary Search ---");
        Arrays.sort(productList); 
        
        Product result2 = binarySearch(productList, searchId);
        System.out.println("Product found: " + result2);
    }
}
