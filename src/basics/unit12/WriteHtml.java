package basics.unit12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
向html文件夹中增加内容
1. 如果有js文件夹，那么就往js文件夹中增加一个文件并且写入脚本
2. 增加完毕这个js文件后，html会自动引入这个js文件
 */
public class WriteHtml {
    static final String PATH = "src/basics.unit12/html";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要创建的js文件(不需要带有后缀)：");
        String fileString = scanner.next();
        File file = new File(PATH + "/js/" + fileString + ".js");
        File pathFile = new File(PATH + "/js");

        PrintWriter pr;
        if (pathFile.isDirectory()) {
            pr = createFile(file);
        } else {
            pathFile.mkdir();
            pr = createFile(file);
        }

        System.out.println("请输入js的脚本文件：");
        String jsContent = scanner.next();
        pr.println(jsContent);
        pr.close();

    }

    public static PrintWriter createFile(File file) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
            PrintWriter p1 = new PrintWriter(PATH + "/testFile.html");
            String sp = "<script src=js/\"" + file.getName() + "\"></script>";
            p1.println(sp);
            p1.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return printWriter;
    }
}
