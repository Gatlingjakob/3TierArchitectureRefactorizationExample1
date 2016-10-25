import java.util.*;
import java.io.*;

public class readWriteFile {
    public static void main (String[] args) throws FileNotFoundException {

        //Data Access Object//
        Scanner input = new Scanner(new File ("C:/Users/Jakob/Desktop/Javatext/Readfile.txt"));

        //Presentation//
        PrintStream write = new PrintStream(new File("C:/Users/Jakob/Desktop/Javatext/Writefile.txt"));

        //Business Logic//
        readWriteFile(input, write);

    }

    public static void readWriteFile(Scanner input, PrintStream write) throws FileNotFoundException {

        //(Business Logic)//

        while (input.hasNextLine()) {

            write.println(input.nextLine());

        }


    }
}

