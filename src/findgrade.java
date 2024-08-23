import java.util.Scanner;

public class findgrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int grade=scanner.nextInt();
        switch(grade)
        {
            case 10:
                break;
            case 50:
                System.out.println("Passed with grade D");
                break;
            case 80:
                System.out.println("Passed with grade B");
                break;
            case 90:
                System.out.println("Passed with grade A");
                break;
        }
    }

}
