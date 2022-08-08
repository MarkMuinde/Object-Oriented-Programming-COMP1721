import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Ex10 {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Error: filename must be specified on command line");
      System.exit(1);
    }
    try{
      Dataset data = new Dataset (args [0]);
      System.out.println ("Dataset size =  " + data.size());
      System.out.printf ("Mean value =  %.3f" , data.meanValue());
    } catch (FileNotFoundException e ) {
      String filename = args[0];
      System.out.println ("The file '" + filename +"' cannot be accesed");
    }
  }
}
