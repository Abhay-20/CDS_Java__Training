import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        ArrayList<String> namelist=new ArrayList<>();
        namelist.add("Adarsh");
        namelist.add("Abhay");
        namelist.add("Ayush");
        namelist.add("Aman");
        namelist.add("Parth");

        double si=namelist.size();
        if(si/2==0)
        {
            System.out.println(namelist.get((int) (si/2+.5)));
        }
        else
        {
            System.out.println(namelist.get((int) (si/2)));
        }
    }
}
