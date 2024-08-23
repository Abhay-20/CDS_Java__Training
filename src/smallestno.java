public class smallestno {
    public static void main(String[] args) {
        int[] no={65,6,75,94,1,59,2};
        int minn=no[0];
        for(int i=0;i<no.length;i++) {
            if (minn > no[i]) {
                minn = no[i];
            }
        }
        System.out.println(minn);
    }
}
