package Character.Writer;

import java.io.FileWriter;

public class WritingFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\shrey\\IdeaProjects\\untitled108\\src\\test.txt");
            fileWriter.write("Hello this is written from FileWriter");
            fileWriter.close();
        }
        catch (Exception e){

        }
    }
}
