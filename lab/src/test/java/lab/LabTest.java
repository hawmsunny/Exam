package lab;

import org.junit.*; 
import static org.junit.Assert.*;

import java.time.LocalDate;

public class LabTest {
	@Test
	public void test_fahrenheitToCentigrade() {
		assertEquals(10,Lab.fahrenheitToCentigrade(50));
	}
	
	@Test
	public void test_centigradeToFahrenheit() {
		assertEquals(50,Lab.centigradeToFahrenheit(10));
	}
	
	@Test
	public void test_removeSignOfExclaimation() {
		assertEquals("Hurrah We won the Match",Lab.removeSignOfExclaimation("Hurrah! We won the Match"));
	}
	
	@Test
	public void test_getCurrentDay() {
		LocalDate localdate= LocalDate.now();
		assertEquals(localdate.getDayOfMonth(),Lab.getCurrentDay());
	}
	
	@Test
	public void test_getCurrentMonth() {
		LocalDate localdate= LocalDate.now();
		assertEquals(localdate.getMonthValue(),Lab.getCurrentMonth());
	}
	
	@Test
	public void test_getCurrentYear() {
		LocalDate localdate= LocalDate.now();
		assertEquals(localdate.getYear(),Lab.getCurrentYear());
	}
}
