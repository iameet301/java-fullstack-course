package exception;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            int[] arr = new int[3];

            // arr[5] = 10;          // ArrayIndexOutOfBoundsException
            int len = str.length();  // NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (NullPointerException | NumberFormatException e) {
            // Multi-catch pipe operator
            System.out.println("Data error: " + e.getClass().getSimpleName());
        } catch (Exception e) {
            // General fallback (must be at the end)
            System.out.println("General error: " + e.getMessage());
        }
    }
}