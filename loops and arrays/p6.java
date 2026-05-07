public class p6 {
    public static void main(String[] args) {
        int[] arr = { 23, 5, 89, 12, 67, 3 };
        int largest = arr[0], smallest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
