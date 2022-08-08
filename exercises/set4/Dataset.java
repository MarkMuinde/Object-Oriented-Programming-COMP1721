import java.util.*;
import java.io.*;
import java.lang.*;

public class Dataset{
    ArrayList <Double> data ;

public Dataset (){
    data = new ArrayList<Double>();
}

public Dataset (String filename) throws FileNotFoundException {
    readFile(filename);
}

public void readFile (String filename) throws FileNotFoundException {
    data = new ArrayList<Double>();
    File file = new File (filename);
    Scanner input = new Scanner (file);
    while (input.hasNextDouble()){
        data.add(input.nextDouble());
    }
}

public int size () {
    return data.size();
}

public double meanValue() throws ArithmeticException {
    double sum = 0;
    double meanValue;
    for (int i=0; i < data.size(); i++) 
        sum += data.get(i); 
    meanValue = sum / data.size(); 
    return meanValue;
}
}