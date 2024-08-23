import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String c="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s="abhcdefghijklmnopqrstuvwxyz";
        String n="0123456789";
        Random r=new Random();
        int l=8;
        String pa=c+s+n;
        char[] arr=new char[l];
        Boolean hasNum=false;
        Boolean hasUpper=false;
        Boolean hasLower=false;
        while(!hasNum && !hasUpper && !hasLower)
        {
            for(int i=0;i<l;i++)
            {
                arr[i]=pa.charAt(r.nextInt(pa.length()));

                if(Character.isDigit(arr[i]))
                {
                    hasNum=true;
                }
                if(Character.isUpperCase(arr[i]));
                {
                    hasUpper= true;
                }
                if(Character.isLowerCase(arr[i]));
                {
                    hasLower=true;
                }
            }

        }
        System.out.println(arr);

    }
}
