public class NIntoArrayOfBecomeAsArray0 {
    public int[] sumZero(int n) {
        int l =0;
        int r = n-1;
        int st = 1;
        int res[]= new int[n];
        while(l<r)
        {
            res[l++]=st;
            res[r--] = -st;
            st++;
        }

        return res;
    }
}
