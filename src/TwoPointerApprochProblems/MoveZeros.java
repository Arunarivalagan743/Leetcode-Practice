package TwoPointerApprochProblems;

public class MoveZeros {
    public static void main(String[] args) {
        int a[] = {0,1,0,3,12};
        int res[] =moveZero(a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
    }
    public static int[] moveZero(int[] nums) {
        int l = 0;
        int r = 1;
        while (r < nums.length) {

            if (nums[l] != 0) {
                l++;
                r++;
            } else if (nums[r] == 0) {
                r++;
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;

            }


        }
return nums;
    }
}
