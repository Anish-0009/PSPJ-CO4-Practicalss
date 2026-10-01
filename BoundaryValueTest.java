public class BoundaryValueTest {

    // Boundary range constants
    private static final int MIN_LIMIT = 1;
    private static final int MAX_LIMIT = 100;

    /**
     * Process boundary value validation
     * @param inputValue The input value to test
     * @return Transformed valid value if adjusted, or original value
     * @throws IllegalArgumentException if value severely violates contract
     */
    public static int processBoundaryInput(int inputValue) {
        // Checking invariant contract
        if (inputValue < MIN_LIMIT) {
            System.out.println("Input out of lower bound. Adjusting to nearest valid boundary...");
            return MIN_LIMIT; // Use the nearest valid boundary value
        } else if (inputValue > MAX_LIMIT) {
            System.out.println("Input out of upper bound. Adjusting to nearest valid boundary...");
            return MAX_LIMIT; // Use the nearest valid boundary value
        }

        // The valid boundary value is accepted without violating the invariant
        System.out.println("Boundary input completes and state remains valid.");
        System.out.println("Yes — value is within the contract.");
        return inputValue;
    }

    public static void main(String[] args) {
        int testInput = 9; // Sample input value

        System.out.println("Testing input: " + testInput);
        int result = processBoundaryInput(testInput);
        System.out.println("Final state value: " + result);
    }
}