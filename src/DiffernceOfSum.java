public class DiffernceOfSum {


        public int differenceOfSums(int n, int m) {
            int s = 0; // sum of numbers divisible by m
            int a = 0; // sum of numbers not divisible by m

            for (int i = 1; i <= n; i++) {
                if (i % m == 0) {
                    s += i;
                } else {
                    a += i;
                }
            }
            return a - s; // return the difference
        }

        public static void main(String[] args) {
            DiffernceOfSum sol = new DiffernceOfSum();

            int n = 10;
            int m = 3;
            int result = sol.differenceOfSums(n, m);

            System.out.println("Difference of sums: " + result);
        }
    }


