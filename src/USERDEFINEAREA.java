import java.util.Scanner;

class USERDEFINEAREA {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int leng=scanner.nextInt();
        int br=scanner.nextInt();
        System.out.println(are(leng,br));
    }
    public static  int are(int len,int b)
    {
        return (len*b);

    }
}
