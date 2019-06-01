package basics.unit12;

import java.io.File;

/*
测试File相关概念
 */
public class TestFileClass {
    public static void main(String[] args){
        File file = new File("src/basics.unit12/html/testFile.html");
        System.out.println(file);
        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否代表一个目录："+file.isDirectory());
        System.out.println("是否代表一个文件："+file.isFile());
        System.out.println("是否隐藏："+file.isHidden());
        System.out.println("文件全部路径："+file.getAbsoluteFile());
        System.out.println("文件最后修改时间"+file.lastModified());
    }
}
