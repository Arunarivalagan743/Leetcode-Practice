import java.util.*;

class Duplicates {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // Add current element to queue
            if (arr[i] == 0) {
                q.add(0);
                q.add(0); // duplicate zero
            } else {
                q.add(arr[i]);
            }

            // Take front of queue and place it back into array
            arr[i] = q.poll();
        }
    }

    // Test main function
    public static void main(String[] args) {
        Duplicates sol = new Duplicates();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        sol.duplicateZeros(arr);

        System.out.println("Output Array:");
        System.out.println(Arrays.toString(arr)); // Expected: [1, 0, 0, 2, 3, 0, 0, 4]
    }
}
