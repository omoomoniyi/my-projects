import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubDStoreOrders {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; String driverLocation = "C:\\Users\\OMONIYI\\eclipse-workspace\\Omnibiz\\Executables\\chromedriver.exe";
        
        System.setProperty("webdriver.chrome.driver", driverLocation);
        driver = new ChromeDriver();
        driver.get("https://subdstore.vercel.app/#/store");
        driver.manage().window().maximize();
        	        
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("/html/body/main/section/div[1]/div/div/div/div/form/div[1]/input")).sendKeys("08095118218");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
        
        Thread.sleep(6000);
        
        driver.findElement(By.xpath("//body/main[@id='maincontent']/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("7563");
        
        Thread.sleep(20000);
        
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[contains(text(),'Save Address')]")).click();
        
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//button[@id='buy-now-25253']")).click();
               
        driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("40");
            
        Thread.sleep(6000);
        
        driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div")).click();
        
        Thread.sleep(6000);
        
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/header/div/div[2]/div/div[2]/span")).click();	        
        
        Thread.sleep(6000);
        
        driver.findElement(By.xpath("//button[@id='checkout']")).click();	
        
        Thread.sleep(6000);
       	          
        driver.findElement(By.xpath("//*[@id=\"confirm-order\"]")).click();
        
        Thread.sleep(10000);	
                
        WebElement SuccessMessage = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[1]/div/div"));
        System.out.println(SuccessMessage.getText());
        String expected_title = "";
        String actual_title = SuccessMessage.getText();
        
        if (expected_title.equals(actual_title)) {
        	System.out.println("");
        }else {
        	System.out.println("Order Placed Failed");
        }
        
        
        driver.close();
	}

}
