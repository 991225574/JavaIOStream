package characterStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//缓冲流读取文件内容，增强效率
public class BufferedRead {
    public static void main(String[] args) {
        try {
            //创建文件对象
            FileReader fileReader=new FileReader("F:\\java\\plane.txt");
            //创建缓冲流对象
            BufferedReader buff=new BufferedReader(fileReader);
            String line="";
            int b=0;
            while ((line = buff.readLine()) != null) {  //buff.readLine()每次阅读一行 效率高
                b++;
                System.out.println(line);
            }
            System.out.println("\n循环了"+b+"次");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
