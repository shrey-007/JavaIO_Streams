package Character.Reader;

import java.io.FileReader;

public class ReadingFile {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("C:\\Users\\shrey\\IdeaProjects\\untitled108\\untitled108.iml");
            // If it is the end of the file then read() will return -1, else it will return unicode value of that character
            // So to read the full file
            // blank spaces bhi toh character hi hai toh java spaces hogi vaha spaces print hojaaegi apne aap
            int unicodeValue;
            while ((unicodeValue=fileReader.read())!=-1){
                char currentChar=(char)unicodeValue;
                System.out.print(currentChar);
            }
            fileReader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
