package Byte.InputStream;

import java.io.FileInputStream;

public class ReadingFromFile {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\shrey\\IdeaProjects\\untitled108\\untitled108.iml");

            int byteData;

            // but it will not print text from file, instead it is printing raw binary data, which you will not understand
            while ((byteData=fileInputStream.read())!=-1){
                System.out.print(byteData+" ");
            }
            fileInputStream.close();
        }
        catch (Exception e){

        }
    }
}
