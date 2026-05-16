public class ExceptionPrecedence {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];

            // This will come cause ArrayIndexOutOfBoundsException
            arr[10] = 50;
        }

        // Subclass exception comes first
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Subclass Exception Catch");
        }

        // Baseclass exception comes later
        catch (Exception e) {
            System.out.println("Base class exception catch");
            System.out.println(e);
        }
    }
}
