import java.io.*;
import java.nio.file.*;

public class HelloWorld {
    public static void readAndPrint() throws IOException{ // if not static, then we need to create an instance first
        Path p = Paths.get("hello.txt");
        BufferedReader reader = Files.newBufferedReader(p);
        while(true){
            String line = reader.readLine();
            if(line == null){
                break;
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException{
//        HelloWorld hw = new HelloWorld();
        HelloWorld.readAndPrint();
    }
}
