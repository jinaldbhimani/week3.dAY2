package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
        List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
        List<WebElement> name = driver.findElements(By.xpath("//div[@class='nameCls']"));
        for (int i = 0; i < brand.size(); i++) {
        	System.out.println("brand" +brand.get(i).getText());
        	System.out.println("brand" +name.get(i).getText());
		}
        
        
		
		// Under "Category" click "Fashion Bags"
		// Print the count of the items Found. 
		// Get the list of brand of the products displayed in the page and print the list.
		// Get the list of names of the bags and print it
		
		
	}

}
