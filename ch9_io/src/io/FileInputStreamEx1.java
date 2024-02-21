package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {

  public static void main(String[] args) {
    InputStream in = null;
    OutputStream out = null;

    try {
      in = new FileInputStream(new File("c:\\temp\\file1.txt"));
      //   out = System.out;
      out = new FileOutputStream("c:\\temp\\file1_copy.txt");
      int data = 0;
      byte b[] = new byte[1024];
      while ((data = in.read()) != -1) {
        out.write(data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        in.close();
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
