package comp1721.cwk1;
import java.io.*;
import java.time.*;
// Implement Analysis class here
public class Analysis{
  public static void main (String[] args) throws FileNotFoundException {
    //function that displays the number of valid records acquired
    WeatherDataset weatherDatasetAnalysis = new WeatherDataset (args [0]);
    int successfullyReadRecords = weatherDatasetAnalysis.size();
    System.out.println(successfullyReadRecords + " valid records acquired");

    //function that displays the highest wind speed and the
    //date & time of its recording
    LocalDateTime dateOfHighestWindSpeed=weatherDatasetAnalysis.maxWindSpeed().getTime();
    System.out.printf("\nHighest wind speed:"  + " %.1f m/s", weatherDatasetAnalysis.maxWindSpeed().getWindSpeed());
    System.out.println("\n(measured on " + dateOfHighestWindSpeed.toString() + ")");

    //function that displays the lowest humidity and the
    //date & time of its recording
    LocalDateTime dateOfLowestHumidity=weatherDatasetAnalysis.minHumidity().getTime();
    System.out.printf("\nLowest humidity:" + "%.1f", weatherDatasetAnalysis.minHumidity().getHumidity());
    System.out.print("%");
    System.out.println("\n(measured on " + dateOfLowestHumidity.toString() + ")");

    //function that displays the highest temperature and the
    //date & time of its recording
    LocalDateTime dateOfHighestTemperature=weatherDatasetAnalysis.maxTemperature().getTime();
    System.out.printf("\nHighest temperature:" +  "%.1f °C", weatherDatasetAnalysis.maxTemperature().getTemperature());
    System.out.println("\n(measured on " + dateOfHighestTemperature.toString() + ")");

    //function that displays the insolation on the
    //day of highest temperature and the 
    //date & time of its recording
    Double dateOfInsolation = weatherDatasetAnalysis.insolation(weatherDatasetAnalysis.maxTemperature().getTime().toLocalDate());
    System.out.printf("\nInsolation on " + dateOfHighestTemperature.toString() + ":" + "  %.3e J/m2",dateOfInsolation);
  }
}
