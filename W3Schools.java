package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {

	// Creating a method for action
	public String Action(String Action) {
		return Action;

	}

	public static void main(String[] args) {
		// Calling the methods and provide input
		W3Schools x = new W3Schools();
		String action = x.Action("Accept");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		
//Using the value to activity
		if (action == "Accept") {
			alert1.sendKeys("Amal");
			alert1.accept();
			System.out.println(driver.findElement(By.id("demo")).getText());
		}
		if (action == "Decline") {
			alert1.dismiss();
			System.out.println();
			System.out.println(driver.findElement(By.id("demo")).getText());
		}

	}
}
