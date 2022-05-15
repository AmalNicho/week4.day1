package week4.day1.Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Final {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.chittorgarh.com");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement findElement = driver
				.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']"));
		List<WebElement> rows = findElement.findElements(By.tagName("tr"));
		List<String> columns_list = new ArrayList<String>();
		for (int i = 0; i < rows.size(); i++) {

			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < columns.size(); j++) {
				if (j == 2) {
					columns_list.add(columns.get(j).getText());
				}

			}

		}

		Set<String> UniqueSecurityName = new LinkedHashSet<String>(columns_list);
		for (String y : UniqueSecurityName) {

			System.out.println(y);

		}
//driver.close();
	}

}
