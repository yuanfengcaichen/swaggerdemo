package club.codeqi.Controller;
import net.sf.sevenzipjbinding.*;
import net.sf.sevenzipjbinding.impl.RandomAccessFileInStream;
import net.sf.sevenzipjbinding.simple.ISimpleInArchive;
import net.sf.sevenzipjbinding.simple.ISimpleInArchiveItem;

import java.io.*;

public class test {
    public static void main(String[] args) {
        try {
            //readfile("F:\\系统\\加密程序\\20210119");
            sout7z1("F:\\系统\\加密程序\\20210119");
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
                        //System.out.println(strArray[strArray.length-1]);
                        if(strArray[strArray.length-1].startsWith("7")&&strArray[strArray.length-1].endsWith("z")){
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
                        String ar = strArray[strArray.length-1];
                        if(ar.equals("mp4")||ar.equals("jpg")||ar.equals("png")||ar.equals("gif")||ar.equals("mov")){

                        }
                        else if(ar.equals("7z")){
                            System.out.println(absolutepath);
                        }
                    } else if (readfile.isDirectory()) {
                        sout7z1(filepath + "\\" + filelist[i]);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
    }

    public static boolean un7z(String file7zPath, final String outPutPath, String passWord) throws Exception {
        boolean flag = false;
        IInArchive archive;
        RandomAccessFile randomAccessFile;
        randomAccessFile = new RandomAccessFile(file7zPath, "r");
        archive = SevenZip.openInArchive(null, new RandomAccessFileInStream(randomAccessFile), passWord);
        int numberOfItems = archive.getNumberOfItems();
        ISimpleInArchive simpleInArchive = archive.getSimpleInterface();
        //for (final ISimpleInArchiveItem it\em : simpleInArchive.getArchiveItems()) {
        ISimpleInArchiveItem item=simpleInArchive.getArchiveItems()[1];
        if (!item.isFolder()) {
            ExtractOperationResult result;
            result = item.extractSlow(new ISequentialOutStream() {
                public int write(byte[] data) throws SevenZipException {
                    try {
                        String parentFilePath = outPutPath;
                        if (!new File(parentFilePath).exists()) {
                            new File(parentFilePath).mkdirs();
                        }
                        IOUtils.write(data, new FileOutputStream(new File(outPutPath + File.separator + item.getPath()), true));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return data.length; // Return amount of consumed
                }
            }, passWord);
            if (result == ExtractOperationResult.OK) {
                flag=true;
            } else {
                flag=false;
            }
        }
        archive.close();
        randomAccessFile.close();
        return flag;
    }
}
