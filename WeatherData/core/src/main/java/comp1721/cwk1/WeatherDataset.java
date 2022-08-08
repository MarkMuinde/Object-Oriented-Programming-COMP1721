package comp1721.cwk1;
import java.time.LocalDate;
import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Implement WeatherDataset class here
public class WeatherDataset{
  //create a linked list for the weather record fields
  LinkedList <WeatherRecord> listOfWeatherRecords;

  public  WeatherDataset (){
    listOfWeatherRecords= new LinkedList<WeatherRecord>();
  }

//function that reads a file from the dataset and throws a
//FileNotFoundException if no file is found
 public  WeatherDataset (String filename) throws FileNotFoundException {
  readFile(filename);
 }

 //function that reads a file from the linked list and throws a
 //FileNotFoundException if no file is found
 public void readFile (String filename) throws FileNotFoundException{
   listOfWeatherRecords= new LinkedList<WeatherRecord>();
   Scanner fileReader = new Scanner (new File(filename));
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
   fileReader.nextLine();
   while (fileReader.hasNextLine()){
     String fileLine = fileReader.nextLine();
     String [] fileColumn = fileLine.split(",");

     if (fileColumn.length!=8){
       continue;
     }
     if (fileColumn[0].isEmpty() || fileColumn[2].isEmpty() || fileColumn[4].isEmpty() || fileColumn[6].isEmpty() || fileColumn[7].isEmpty())
     {
       continue;
     }
     LocalDateTime convertToNewDataTypeDate = LocalDateTime.parse (fileColumn[0],formatter);
     Double convertToNewDataTypeWindSpeed = Double.parseDouble(fileColumn[2]);
     Double convertToNewDataTypeTemperature = Double.parseDouble(fileColumn[4]);
     Double convertToNewDataTypeSolarIrradiance = Double.parseDouble(fileColumn[6]);
     Double convertToNewDataTypeHumidity = Double.parseDouble(fileColumn[7]);
     add (new WeatherRecord(convertToNewDataTypeDate, convertToNewDataTypeWindSpeed, convertToNewDataTypeTemperature, convertToNewDataTypeSolarIrradiance, convertToNewDataTypeHumidity));
   }
   fileReader.close();
 }

 //function that returns the size of the Linked List
 public int size(){
   return listOfWeatherRecords.size();
 }

 //function that returns the index of a record in the Linked List
 public WeatherRecord get(int index){
   return listOfWeatherRecords.get(index);
 }

 //function that adds a record to the Linked List
 public void add (WeatherRecord record){
   listOfWeatherRecords.add(record);
 }

 //function that returns the maximum wind speed in the linked list
 //and throws a weather exception if it is not found
 public WeatherRecord maxWindSpeed() throws WeatherException{
   boolean thereIsSomeData=false;
   double maximumWindSpeed=0;
   int maxWind=0;
   for (int i=0; i<listOfWeatherRecords.size();i++)
   {
      if (listOfWeatherRecords.get(i).getWindSpeed()>maximumWindSpeed)
      {
        maximumWindSpeed=listOfWeatherRecords.get(i).getWindSpeed();
        maxWind=i;
        thereIsSomeData=true;
      }
   }
   if (thereIsSomeData=false)
     throw new WeatherException ("");
   return listOfWeatherRecords.get(maxWind);
 }

 //function that returns the maximum temperature in the linked list
 //and throws a weather exception if it is not found
 public WeatherRecord maxTemperature() throws WeatherException {
   boolean thereIsSomeData=false;
   double maximumTemperature=0;
   int maxTemp=0;
   for (int i=0; i<listOfWeatherRecords.size();i++)
   {
      if (listOfWeatherRecords.get(i).getTemperature()>maximumTemperature)
      {
        maximumTemperature=listOfWeatherRecords.get(i).getTemperature();
        maxTemp=i;
        thereIsSomeData=true;
      }
   }
   if (thereIsSomeData=false)
     throw new WeatherException ("");
   return listOfWeatherRecords.get(maxTemp);
 }

 //function that returns the minimum humidity in the linked list
 //and throws a weather exception if it is not found
 public WeatherRecord minHumidity() throws WeatherException {
   boolean thereIsSomeData=false;
   double minimumHumidity=1000000;
   int minHum=0;
   for (int i=0; i<listOfWeatherRecords.size();i++)
   {
      if (listOfWeatherRecords.get(i).getHumidity()<minimumHumidity)
      {
        minimumHumidity=listOfWeatherRecords.get(i).getHumidity();
        minHum=i;
        thereIsSomeData=true;
      }
   }
   if (thereIsSomeData=false)
     throw new WeatherException ("");
   return listOfWeatherRecords.get(minHum);
 }

 //function that returns the insolation
 //and throws a weather exception if it is not found
 public double insolation(LocalDate date) throws WeatherException{
   boolean thereIsSomeData=false;
   double theInsolation=0;
   LocalDate insolationDate;
   for (WeatherRecord record: listOfWeatherRecords){
     insolationDate=record.getTime().toLocalDate();
     if (insolationDate.equals(date)){
         thereIsSomeData=true;
         theInsolation+= record.getSolarIrradiance()*60*60;
     }
   }
   if (thereIsSomeData=false)
     throw new WeatherException ("");
   return theInsolation;
 }
}
