import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class CheckDuplicateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements in the list: ");
            int n = scanner.nextInt();

            System.out.println("Enter the list of integers:");

            // Read the list of integers
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                // Check for duplicates
                if (integerList.contains(num)) {
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }

                integerList.add(num);
            }

            System.out.println("No duplicates found. List is: " + integerList);
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input or unexpected exception occurred.");
        } finally {
            scanner.close();
        }
    }
}
