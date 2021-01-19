package club.codeqi.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            readfile("D:\\亚龙展旗\\项目\\上海浦西\\test");
            //sout7z1("D:\\亚龙展旗\\项目\\上海浦西\\test");
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        System.out.println("ok");
    }
    public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
        try {
            File file = new File(filepath);
            if (!file.isDirectory()) {
                System.out.println("文件 ");
                System.out.println("path=" + file.getPath());
                System.out.println("absolutepath=" + file.getAbsolutePath());
                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                //System.out.println("文件夹");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        String absolutepath = readfile.getAbsolutePath();
                        //System.out.println("absolutepath=" + absolutepath);
                        //System.out.println("name=" + readfile.getName());
                        String[] strArray = absolutepath.split("\\.");
                        //System.out.println(strArray[0]);
                        //System.out.println(strArray[1]);
                        if(strArray[1].startsWith("7")&&strArray[1].endsWith("z")){
                            File nf = new File(strArray[0]+".7z");
                            try {
                                readfile.renameTo(nf); // 修改文件名
                                System.out.println(nf.getName());
                             } catch (Exception err) {
                                err.printStackTrace();
                             }
                        }
                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }
    public static void sout7z1(String filepath) throws FileNotFoundException, IOException{
        try {
            File file = new File(filepath);
            if (!file.isDirectory()) {
            } else if (file.isDirectory()) {
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        String absolutepath = readfile.getAbsolutePath();
                        String[] strArray = absolutepath.split("\\.");
                        System.out.println(strArray[1]);
                    } else if (readfile.isDirectory()) {
                        sout7z1(filepath + "\\" + filelist[i]);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
    }
}
