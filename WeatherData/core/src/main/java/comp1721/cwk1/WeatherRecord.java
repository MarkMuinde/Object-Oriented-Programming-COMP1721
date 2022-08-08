package comp1721.cwk1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// Implement WeatherRecord class here
public class WeatherRecord{
  private LocalDateTime time;
  private double windSpeed;
  private double temperature;
  private double solarIrradiance;
  private double humidity;

  public WeatherRecord(LocalDateTime time,double windSpeed,double temperature,double solarIrradiance,double humidity){
      this.time = time;
      this.windSpeed =windSpeed;
      this.temperature = temperature;
      this.solarIrradiance = solarIrradiance;
      this.humidity = humidity;
  }

//function that gets time
  public LocalDateTime getTime(){
      return time;
  }

//function that gets windspeed
  public double getWindSpeed(){
    return windSpeed;
  }

//function that gets temperature
  public double getTemperature(){
      return temperature;
  }

//function that gets solar irradiance
  public double getSolarIrradiance(){
    return solarIrradiance;
  }

//function that gets humidity
  public double getHumidity(){
    return humidity;
  }

  //function that returns the values of all the weather record fields in a string
  public String toString(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    String dateAsString = time.format(formatter);
    String windSpeedAsString = String.format("%.1f", windSpeed);
    String temperatureAsString = String.format("%.1f",temperature);
    String solarIrradianceAsString = String.format("%.1f",solarIrradiance);
    String humidityAsString = String.format("%.1f",humidity);
    String allFieldsAsStrings = String.format (dateAsString + "," + windSpeedAsString + "," + temperatureAsString + "," + solarIrradianceAsString + "," + humidityAsString);
    return allFieldsAsStrings;
  }
}
