public class ArrayIndexOutOfBoundsDemo {
    public static void generateException() {
        String[] arr = {"A", "B", "C"};
        System.out.println(arr[5]);
    }
    public static void handleException() {
        try {
            String[] arr = {"A", "B", "C"};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}
