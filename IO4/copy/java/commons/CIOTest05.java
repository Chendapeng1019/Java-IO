package commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CIOTest01
 * @Description 拷贝
 * @Author chendapeng
 * @Date 2019/6/10
 **/
public class CIOTest05 {
    public static void main(String[] args) throws IOException {
        //写出文件
       // FileUtils.copyFile(new File("p.jpg"),new File("p-copy.jpg"));

        //复制文件到目录
        //FileUtils.copyFileToDirectory(new File("p.jpg"),new File("G:\\Java\\IO4\\src\\main\\resources"));

        //复制目录
        FileUtils.copyDirectory(new File("G:\\Java\\IO4\\src\\main"),new File("G:\\Java\\IO4\\copy"));

        //拷贝URL内容
        String url = "http://img.mm4000.com/file/a/bd/9881a28919_1044.jpg";
        FileUtils.copyURLToFile(new URL(url),new File("meinv.jpg"));
    }
}
