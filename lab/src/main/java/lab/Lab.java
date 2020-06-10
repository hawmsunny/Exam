package lab;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
public class Lab {
	static Date today = new Date();
	
	/**
	 * this method converts fahrenheit into Centigrade
	 * @param fahrenheit the integer to be tested
	 * @return result will be in the integer
	*/
	public static int fahrenheitToCentigrade(int fahrenheit) {
	return (fahrenheit - 32) * 5 / 9;
	}
	
	/**
	 * this method converts Centigrade into fahrenheit
	 * @param Centigrade the integer to be tested
	 * @return result will be in integer
	*/
	public static int centigradeToFahrenheit(int centigrade) {
	return centigrade * 9 / 5 + 32;
	}
	
	/**
	 * this method remove the exclamation sign from any string
	 * @param in the string will be passed
	 * @return result will be in string
	*/
	public static String removeSignOfExclaimation(String in){
	if(in==null||in.length()==0)
	return in;
	return in.replaceAll("!", "");
	}
	
	/**
	 * this method will get the today day
	 * @return result will in the integer
	*/
	public static int getCurrentDay(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getDayOfMonth();
	}
	
	/**
	 * this method will return the current month
	 * @return result will be in the integer
	*/
	public static int getCurrentMonth(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getMonthValue();
	}
	
	/**
	 * this method will return the current year
	 * @return result will be in integer
	*/
	public static int getCurrentYear(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getYear();
	}
}
