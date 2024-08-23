public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum=0;
        do {
            sum=sum+i;
            System.out.println(i);
            i++;

        }
        while(i<=9);
            {
                sum=sum+i;
                System.out.print(i+"    ");
                i++;
            }
            System.out.println(sum);



    }
}
