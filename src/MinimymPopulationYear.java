import java.util.*;

public class MinimymPopulationYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] logs = new int[n][2];

        // Get user input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter birth and death year for person " + (i + 1) + ":");
            logs[i][0] = sc.nextInt();  // birth year
            logs[i][1] = sc.nextInt();  // death year
        }

        // Map to store year and its population count
        Map<Integer, Integer> yearCount = new HashMap<>();

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];

            for (int year = birth; year < death; year++) {
                yearCount.put(year, yearCount.getOrDefault(year, 0) + 1);
            }
        }

        // Find earliest year with max population
        int maxPopulation = 0;
        int resultYear = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : yearCount.entrySet()) {
            int year = entry.getKey();
            int count = entry.getValue();

            if (count > maxPopulation || (count == maxPopulation && year < resultYear)) {
                maxPopulation = count;
                resultYear = year;
            }
        }

        System.out.println("Maximum population year: " + resultYear);
    }
}
