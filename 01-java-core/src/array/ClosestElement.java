package array;

public class ClosestElement {
    public static void main(String[] args) {
        int[] arr = {2, 8, 15, 22, 35};
        int target = 18;
        int closest = arr[0];

        for (int num : arr) {
            if (Math.abs(num - target) < Math.abs(closest - target)) {
                closest = num;
            }
        }

        System.out.println("Closest element to " + target + " is: " + closest);
    }
}
