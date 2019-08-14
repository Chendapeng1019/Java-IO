package commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.*;

import java.io.File;
import java.util.Collection;

/**
 * @ClassName CIOTest01
 * @Description
 * 列出子孙级
 * @Author chendapeng
 * @Date 2019/6/10
 **/
public class CIOTest02 {
    public static void main(String[] args) {
       Collection<File> files =FileUtils.listFiles(new File("G:\\Java\\IO4"), EmptyFileFilter.NOT_EMPTY,null);
       for(File file:files){
           System.out.println(file.getAbsolutePath());
       }

        System.out.println("------------------------------------");
        files =FileUtils.listFiles(new File("G:\\Java\\IO4"), EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("------------------------------------");
        files =FileUtils.listFiles(new File("G:\\Java\\IO4"), new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("------------------------------------");
        files =FileUtils.listFiles(new File("G:\\Java\\IO4"), FileFilterUtils.or(new SuffixFileFilter("java"),new SuffixFileFilter("class")), DirectoryFileFilter.INSTANCE);
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("------------------------------------");
        files =FileUtils.listFiles(new File("G:\\Java\\IO4"), FileFilterUtils.and(new SuffixFileFilter("java"),EmptyFileFilter.NOT_EMPTY), DirectoryFileFilter.INSTANCE);
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }

    }
}
