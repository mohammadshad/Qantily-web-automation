package Qantily;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	 WebDriver driver;
	  @BeforeTest
		 public void beforeTest() {
		 String driverPath = "/home/shad/Desktop/Chromedriver/chromedriver";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.navigate().to("http://3.108.64.95/");
		driver.navigate().to("https://staging.qantily.com/");
		
	  }
	  @Test(priority=1)
	  public void register() throws Exception {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div[1]/div[3]/ul/li[2]")).click();
		Thread.sleep(2000);
		
		String	heading = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div")).getText();
		
		System.out.println("actual heading --- "+heading);
		  
	  }
  
	  @Test(priority=2)
	  public void click_start_testing_now() throws Exception {
		 
		  Thread.sleep(2000);  
		  
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div")).click();
		Thread.sleep(2000);
	  }
	  
	  
	  @Test(priority=3)
	  public void checkbox_string1() throws Exception {
		 
		
			  String expectedHeading = "I hereby declare that the information provided above is true to its very nature.*";
			  Thread.sleep(2000); 
			
			 String checkbox1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[2]/label[1]")).getText();
			Thread.sleep(2000);
			
		//String emailerror =	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[6]/small")).getText();
		if(expectedHeading.equalsIgnoreCase(checkbox1))
	     	System.out.println("The expected heading is same as actual heading --- "+checkbox1);
		else
	     	System.out.println("The expected heading doesn't match the actual heading --- "+checkbox1);
	 
		  
		  }  
		  
		 /* 
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[9]/label[2]")));
		    //passwordElement.click();
		  //passwordElement.clear();
		     passwordElement.sendKeys("/home/shad/Desktop/Chromedriver/chromedriver/download.png");
		  
		 
		     
		     
		     
		     
		  
		  
		 // WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[9]"));
		//Thread.sleep(2000);
		//upload_file.sendKeys("/home/shad/Desktop/Chromedriver/chromedriver/download.png");
		
		
		*/
		
		
	  @Test(priority=4)
	  public void checkbox_string2() throws Exception {
		 
		
			  String expectedHeading = "I want to subscribe to notifications of new projects via Email.*";
			  Thread.sleep(2000); 
			
			 String checkbox1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[2]/label[2]")).getText();
			Thread.sleep(2000);
			
		//String emailerror =	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[6]/small")).getText();
		if(expectedHeading.equalsIgnoreCase(checkbox1))
	     	System.out.println("The expected heading is same as actual heading --- "+checkbox1);
		else
	     	System.out.println("The expected heading doesn't match the actual heading --- "+checkbox1);
	 
		  
		  }  
		
	  
	  @Test(priority=5)
	  public void checkbox_string3() throws Exception {
		 
		
			  String expectedHeading = "By Signing up you agree to our Terms and Conditions and Privacy Policy.*";
			  Thread.sleep(2000); 
			
			 String checkbox1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[2]/label[3]")).getText();
			Thread.sleep(2000);
			
		//String emailerror =	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[1]/div[6]/small")).getText();
		if(expectedHeading.equalsIgnoreCase(checkbox1))
	     	System.out.println("The expected heading is same as actual heading --- "+checkbox1);
		else
	     	System.out.println("The expected heading doesn't match the actual heading --- "+checkbox1);
	 
		  
		  }  
	   
	  
	  @Test(priority=6)
	  public void first_checkbox_enabled() throws Exception {
		 
		
		  // Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[2]/label[1]/input"));						

	        // This will Toggle the Check box 		
	        option1.click();			

	        // Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }	
		  }  
	  
	  
	  @Test(priority=6)
	  public void second_checkbox_enabled() throws Exception {
		 
		
		  // Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[2]/label[2]/input"));						

	        // This will Toggle the Check box 		
	        option1.click();			

	        // Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }	
		  }  
	  
	  @Test(priority=6)
	  public void third_checkbox_enabled() throws Exception {
		 
		
		  // Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/form/div[2]/label[3]/input"));						

	        // This will Toggle the Check box 		
	        option1.click();			

	        // Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }	
		  }  
		  
}
