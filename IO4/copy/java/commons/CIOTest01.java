package commons;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @ClassName CIOTest01
 * @Description
 * 大小
 * @Author chendapeng
 * @Date 2019/6/10
 **/
public class CIOTest01 {
    public static void main(String[] args) {
        //文件大小
        long len = FileUtils.sizeOf(new File("G:/Java/IO4/src/main/java/commons/CIOTest01.java"));
        System.out.println(len);
        //目录大小
        len = FileUtils.sizeOf(new File("G:\\Java\\IO4"));
        System.out.println(len);
    }
}
