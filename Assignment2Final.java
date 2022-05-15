package week4.day1.Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Final {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://html.com/tags/table/");
		WebElement findElement = driver.findElement(
				By.xpath("//caption[text()='The Three Most Popular JavaScript Libraries']/ancestor::table"));

		List<WebElement> Rows = findElement.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		int a = 0;
		for (int j = 0; j < Rows.size(); j++) {

			List<WebElement> Columns = Rows.get(j).findElements(By.tagName("td"));

			for (int i = 0; i < Columns.size(); i++) {
				// System.out.println(Columns.get(i).getText());

			}
			a = Columns.size();
		}
		System.out.println("The number of rows is " + Rows.size());
		System.out.println("The number of columns is " + a);
		
		System.out.println("                     ");
		System.out.println("--------------------------------------------------------------------------");

		// Assignment 3

		WebElement findElement2 = driver.findElement(By.xpath("//table[@class='attributes-list']"));

		List<WebElement> attributesrows = findElement2.findElements(By.tagName("tr"));

		for (int i = 0; i < attributesrows.size(); i++) {

			List<WebElement> attributescolumns = attributesrows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < attributescolumns.size(); j++) {
				System.out.println(attributescolumns.get(j).getText());

			}
		}

	}

}
