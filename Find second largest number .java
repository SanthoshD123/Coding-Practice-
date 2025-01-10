public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 9, 6};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int number : numbers) {
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
        }
        
        System.out.println("Second Largest: " + secondLargest);
    }
}
