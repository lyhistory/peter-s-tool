package io.stormbird.token.management.Util;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileHelper {
    public static boolean createFileIfNotExists(String filePath){
        try {
            File f =  new File(filePath);
            if (f.exists()==false) {
                if(f.getParentFile().exists()==false){
                    f.getParentFile().mkdirs();
                }
                f.createNewFile();
            }
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "unexpected error try to create "+filePath);
            return false;
        }
    }
    public static void writeFile(String filePath, byte[] data) throws IOException {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(filePath, "rw");
            raf.write(data);
        } finally {
            if (raf != null) {
                raf.close();
            }
        }
    }
}