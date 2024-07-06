//This program shows how Writing and Reading from a File is done in Java

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WritingandReadingFile {
    public static void main(String args[])
    {
        try
        {
            File obj = new File("File.txt");
            if(obj.createNewFile())
            {
                System.out.println(obj.getName());
            }
            else
            {
                System.out.println("File already exists!");
            }
            FileWriter wr = new FileWriter("File.txt");
            wr.write("Learning Java");
            wr.close();
            System.out.println("Successfully wrote the information");

            File obj_1 = new File("File.txt");
            Scanner myReader = new Scanner(obj_1);
            while(myReader.hasNextLine())
            {
                String info = myReader.nextLine();
                System.out.println("Information = "+info);
            }
            myReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("An Error Occured");
        }
    }
}