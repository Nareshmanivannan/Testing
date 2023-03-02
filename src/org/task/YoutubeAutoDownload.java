package org.task;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class YoutubeAutoDownload {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nares\\eclipse-workspace\\Testing\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mudhal nee mudivum nee song");
		WebElement scrh = driver.findElement(By.id("search-icon-legacy"));
		scrh.click();
		Thread.sleep(2000);
		WebElement aa = driver.findElement(By.xpath("(//yt-formatted-string[text()='Mudhal Nee Mudivum Nee - Title Track Video | Darbuka Siva | Sid Sriram | Thamarai'])[1]"));
		aa.click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	String a="https://www.ssyoutube.com/";
	 String[] parts = currentUrl.split("/");
	String part1 = parts[3];
	System.out.println(part1);
	String url=a+part1;
	System.out.println(url);
	driver.get(url);
	Thread.sleep(2000);
	driver.findElement(By.name("sf_submit")).click();
	Thread.sleep(2000);
	WebElement ff = driver.findElement(By.xpath("//a[text()='Download']"));
	
	ff.click();
	}
}