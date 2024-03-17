import java.util.Scanner;

public class trappingRainwater {
    public static int trap(int[] a) {
        int n = a.length;
        if (n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = a[0];
        for (int i = 1; i < n; i++) left[i] = Math.max(left[i - 1], a[i]);

        right[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) right[i] = Math.max(right[i + 1], a[i]);

        int ans = 0;
        for (int i = 0; i < n; i++) ans += Math.min(left[i], right[i]) - a[i];

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        System.out.println("Amount of water that can be trapped: " + trap(a));
    }
}
