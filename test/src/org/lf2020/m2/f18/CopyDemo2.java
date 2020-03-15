package org.lf2020.m2.f18;

import java.io.*;

/**
 * @ClassName: CopyDemo2
 * @Description: 复制多级文件夹文件
 * @Author: 梁飞
 * @Date: 2020/2/18 22:37
 */
public class CopyDemo2 {
    public static void main(String[] args) {
        File src =new File( "D:\\log");
        File dest =new File( "E:\\");
        copy(src,dest);

    }

    public static void copy(File srcFile,File destFile){
        File newFile = new File(destFile,srcFile.getName());
       if(srcFile.isDirectory()) {
           newFile.mkdir();
           File[] files = srcFile.listFiles();
           for(File f:files) {
               copy(f,newFile);
           }
       }
       else{

           copyFile(srcFile,newFile);

        }
    }

    public static void copyFile(File srcFile,File destFile){
                BufferedInputStream bis = null;
                BufferedOutputStream bos =null;
                try {
                     bis = new BufferedInputStream(new FileInputStream(srcFile));
                     bos = new BufferedOutputStream(new FileOutputStream(destFile));
                    byte[] bytes = new byte[1024];
                    int len;
                    while((len=bis.read(bytes))!=-1){
                        bos.write(bytes,0,len);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally{
                    if(bis!=null){
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(bos!=null){
                        try {
                            bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
    }

