package Strings;

import java.util.Arrays;

public class Main {
 public static void main(String[] args) {
	 String files = "abc.txt, ab.txt, ab.txt.jpg, ab.txt.jpg.txt.txt";
	
	 int txtCount=0;
	 int jpgCount=0;
	 
	 String[] arr = files.split(", ");
	 for (String fileName : arr) {
	     int dot = fileName.lastIndexOf(".");
	     if (dot != -1) {
	         String extension = fileName.substring(dot + 1);
	         if (extension.equals("txt")) {
	             txtCount++;
	         } else if (extension.equals("jpg")) {
	             jpgCount++;
	         }
	     }
	 }
	 
	 System.out.println(txtCount);
	 System.out.println(jpgCount);
	
	
}
}
