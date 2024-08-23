import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehanding {
    public static void main(String[] args) {

//        creating a new file and check its availability
        Scanner filename=new Scanner(System.in);
        String file_name=filename.nextLine();
        File file=new File(file_name+".txt");
        try {
            if(file.exists())
            {
                System.out.println("File is already created");
            }
            else
            {
                file.createNewFile();
                System.out.println("File is Created");
            }


//            Writing in file

            FileWriter fileWriter=new FileWriter(file_name+".txt");
            fileWriter.write("MY name is sooooo cool");
            fileWriter.close();


//            reading a file
            Scanner ne=new Scanner(file);
            while(ne.hasNextLine())
            {
                String line=ne.nextLine();
                System.out.println(line);
            }

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}
