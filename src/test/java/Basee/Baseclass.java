package Basee;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public	static WebDriver driver;
	
	
	//CHROME 
	public static void Chrome() {
		
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver ();
		
				
	}
	
	//FIREFOX
	
	public static  void firefox() {
		
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();

	}
	
	//edge
	
	public static void edege() {
		
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();

	}
	
	//
	
	public static void opera() {
		
		WebDriverManager.operadriver().setup();
		driver =new OperaDriver();
		
	}
	
	//For Launch the URL
	public static  void url(String url) {
		
		driver.get(url);
		
}
	//LOCATORS ID
	public static  void id(String id, String text) {
		
  driver.findElement(By.id(id)).sendKeys(text);
	}
	
	//CLICK
	public static void Click(String id) {
		
    WebElement clik = driver.findElement(By.id(id));
    clik.click();
	}
	
	//LOCATOR XPATH
	public static void xapths(String Xapth, String text) {
		
		driver.findElement(By.xpath(Xapth)).sendKeys(text);
		
	}

	//XPATH CLICK
	public static void xpathclick(String Xapth) {
	
		WebElement xpathclik = driver.findElement(By.xpath(Xapth));
		
		xpathclik.click();
	}
	
	//lOCATOR BY NAME
	public static  void name(String Name, String text) {
	 driver.findElement(By.name(Name)).sendKeys(text);

	}
	
	//lOCATOR BY CLASS NAME
	public static void Byclassname(String Byclassname, String text) {
		
		driver.findElement(By.className(Byclassname)).sendKeys(text);

	}
	
	//css Selector
	
	public static void cssselectors(WebElement cssselector, String text) {
		Select capture = new Select(cssselector);
		capture.selectByVisibleText(text);
		
	}
	
	//deselect css
	public static void deslectCss(WebElement cssselector, String text) {
		
		Select capture = new Select(cssselector);
		capture.deselectByVisibleText(text);

	}
	
	//Select DropDownbyText
	
	public static void dropdownbyText(WebElement element,String text) {
		Select capture =  new Select (element);
		capture.selectByVisibleText(text);
		
	}
	
	//Dropdown Index
	
	public static void dropdownIndex(WebElement element , int index) {
		 
		Select capture =  new Select (element);
		capture.selectByIndex(index);
		
         
	}
	
	//Deselect By Text
	public static void deselectIndex(WebElement element , int index) {
		Select capture =  new Select (element);
		capture.selectByIndex(index);

	}
	
	
	public static void maximize() {
		
		driver.manage().window().maximize();
		
	}
	
	public static void minimize() {
		
		driver.manage().window().minimize();

	}
	
	public static void fullscreans() {
		
		driver.manage().window().fullscreen();
	}
	
	
	//wait
	public static void thredwaits() throws InterruptedException {
	
		Thread.sleep(500);
		
	}
	public static void implicitiywaits () {
		
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds(30));
				
				
		}	
	
	
	// Current Url
	public static void getcurrenturl() {
		
		driver.getCurrentUrl();
		

	}
	//Title
	public static void gettitle() {
	
		driver.getTitle();

	}
	
	//Quit
	public static void quit() {
		driver.quit();

	}
	
	public static void forward() {
		
		driver.navigate().forward();

	}
	
	public static  void backword() {
		
		driver.navigate().back();
		
	}
	
	public static void refresh() {
		
		driver.navigate().refresh();

	}
	
	public static void deletecookies() {
		
		driver.manage().deleteAllCookies();

	}
	
	public static  void cookiesName(String name) {
		
		driver.manage().getCookieNamed(name);

	}
	
	//Clear Text
	public static void clearText(WebElement text) {
	
	text.clear();

	}
	
	//Accept Alert
	public static void accepetAlert() {
	driver.switchTo().alert().accept();
	
	
	}
	 //dismiss Alert
	public static void ignoreAlert() {
	driver.switchTo().alert().dismiss();

	}
	public static void robotsDown() throws AWTException {
		
		
		Robot r = new Robot ();
		
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	public static void  robotsUp() throws AWTException {
		
		
		Robot re = new Robot ();
		
		re.keyPress(KeyEvent.VK_UP);
		re.keyRelease(KeyEvent.VK_UP);

}
	public static void robotsEnter() throws AWTException {
		
		Robot e = new Robot ();
		
		e.keyPress(KeyEvent.VK_ENTER);
		e.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void robotsEscape() throws AWTException{
		
		Robot es = new Robot ();
		es.keyPress(KeyEvent.VK_ESCAPE);
		es.keyRelease(KeyEvent.VK_ESCAPE);

	}
}
	
	
	
	
	

	
