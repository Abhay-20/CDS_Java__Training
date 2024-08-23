public class greatestno {
    public static void main(String[] args) {
        int[] no={65,6,75,2,94,2,59,2};
        int max=0;
        for(int i=0;i<no.length;i++)
        {
            if(max<no[i])
            {
                max = no[i];
            }
        }
        System.out.println(max);
    }
}
