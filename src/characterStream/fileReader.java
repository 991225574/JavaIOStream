package characterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//使用普通fileReader函数读取文件内容
public class fileReader {
    public static void main(String[] args) {
        //定义文件对象
        FileReader fileReader;
        try {
            //创建文件对象
            fileReader = new FileReader("F:\\java\\plane.txt"); //文件路径

            int a=0;
            int b=0;
            while((a=fileReader.read())!=-1){  //fileReader.read()每次读取一个字符返回ascll码，到文件内容结尾就返回-1
                b++;
                System.out.print((char)a);  //ascll码强转字符输出
            }
            System.out.println("\n循环次数"+b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
