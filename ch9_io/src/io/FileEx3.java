package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

  public static void main(String[] args) throws IOException {
    File temp = new File("c:\\temp\\");
    File dir = new File("c:\\temp\\dir");
    File file1 = new File("c:\\temp\\file1.txt");
    File file2 = new File(temp, "file2.txt");
    File file3 = new File("c:\\temp\\dir\\file3.txt");
    File file4 = new File("c:\\temp\\dir\\Hello.java");

    //존재하지 않을 때 새로 생성
    if (!dir.exists()) dir.mkdirs();
    if (!file1.exists()) file1.createNewFile();
    if (!file2.exists()) file2.createNewFile();
    if (!file3.exists()) file3.createNewFile();
    if (!file4.exists()) file4.createNewFile();

    //yyyy 년도 MM 월 dd 일자 a am/pm HH 시 mm 분
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

    //temp 폴더 읽어오기
    File[] files = temp.listFiles();
    //날짜 시간 형태 크기 이름
    System.out.println("============================================");
    System.out.println("  날짜   시간   형태   크기   이름");
    System.out.println("============================================");
    for (File file : files) {
      String fileName = file.getName();
      //lastModified() : 1970-01-01 시작으로 현재 오늘날짜 까지의 시간을 밀리세컨드로 돌려줌
      //                 2024-02-21 오후 4시 9분
      //Date date = new Date(file.lastModified());
      //System.out.println(date);
      //System.out.println(sdf.format(date));
      if (file.isDirectory()) {
        System.out.println("\t<DIR>\t\t\t" + fileName);
      } else {
        System.out.println("\t\t\t" + file.length() + "\t" + fileName);
      }
    }
  }
}
