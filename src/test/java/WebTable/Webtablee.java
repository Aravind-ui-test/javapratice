package WebTable;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtablee {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
driver.get("https://www.iplt20.com/points-table/men/2022");


driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.manage().window().maximize();

WebElement clicks = driver.findElement(By.xpath("//button[@class='cookie__accept btn btn-primary']"));

clicks.click();


WebElement sample = driver.findElement(By.xpath("//div[@class='ih-pt-tab-bg p-0']"));
List<WebElement> tableshead = sample.findElements(By.tagName("td"));

for (WebElement tabth : tableshead) {
	String text = tabth.getText();
	System.out.println(text);
}

List<WebElement> allrowss = sample .findElements(By.cssSelector("tbody tr"));
int size = allrowss.size();



System.out.println(size);


for (WebElement sele : allrowss) {
	List<WebElement> selecets = sele.findElements(By.tagName("td"));
	WebElement sizeee = selecets.get(0);
	System.out.println(sizeee.getText());
}
// for(int i=0; i<size ; i++ ) {
//	 
//	 List<WebElement> alll = allrowss.get(i).findElements(By.tagName("td"));
//	 WebElement lastname = alll.get(0);
//	 
//	 String text = lastname.getText();
//	 
//	 System.out.println(text);
//	 
//	 lastname.getLocation();
// }

	
	}}


