public class loopsarray {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
    
}
