
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
 
        logger1.log("This is the first log message");
        logger2.log("This is the second log message");
 
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same");
        } else {
            System.out.println("Different instances");
        }
        System.out.println("Logger1 hashcode: " + logger1.hashCode());
        System.out.println("Logger2 hashcode: " + logger2.hashCode());
    }
}
