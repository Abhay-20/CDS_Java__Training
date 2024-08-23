import java.util.ArrayList;

public class ArrayListRepeated {
    public static void main(String[] args)
    {
        ArrayList<String> namelist=new ArrayList<>();
        namelist.add("Adarsh");
        namelist.add("Abhay");
        namelist.add("Ayush");
        namelist.add("Aman");
        namelist.add("Parth");
        namelist.add("Adarsh");
        int si=namelist.size();

        for(int i=0;i<si;i++)
        {
            int count=0;
            for(int j=i+1;j<si;j++)
            {
                if(namelist.get(i)==namelist.get(j))
                {
                    count++;
                }

            }
            System.out.println(namelist.get(i)+ "     " + count);
        }
    }
}
