public class p5 {
    public static void main(String[] args) {
        // Array with 99 elements; number 50 is missing as example
        int[] arr = new int[99];
        int count = 1;
        for (int i = 0; i < 99; i++) {
            if (count == 50) count++; // skip 50
            arr[i] = count++;
        }

        int expectedSum = 100 * 101 / 2; // Sum of 1 to 100
        int actualSum = 0;
        for (int num : arr) actualSum += num;

        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}