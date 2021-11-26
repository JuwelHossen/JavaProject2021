import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write
{
    public static void main(String[] args) throws IOException
    {

        FileWriter fw=new FileWriter("/Users/juwel/Desktop/Java 2021/FileReadWrite/file.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("hello world , i am writing");
        bw.close();
        fw.close();

    }

}
