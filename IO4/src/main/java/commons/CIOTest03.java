package commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName CIOTest01
 * @Description 读取内容
 * @Author chendapeng
 * @Date 2019/6/10
 **/
public class CIOTest03 {
    public static void main(String[] args) throws IOException {
        //读取文件
        String msg = FileUtils.readFileToString(new File("G:\\Java\\IO4\\aaa.txt"),"UTF-8");
        System.out.println(msg);
        byte[] datas = FileUtils.readFileToByteArray(new File("G:\\Java\\IO4\\aaa.txt"));
        System.out.println(datas.length);

        //逐行读取
        List<String> msgs = FileUtils.readLines(new File("G:\\Java\\IO4\\aaa.txt"),"UTF-8");
        for(String s:msgs){
            System.out.println(s);
        }

        LineIterator it = FileUtils.lineIterator(new File("G:\\Java\\IO4\\aaa.txt"),"UTF-8");
        while (it.hasNext()){
            System.out.println(it.nextLine());
        }
    }
}
