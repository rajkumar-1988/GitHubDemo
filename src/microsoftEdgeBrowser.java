import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class microsoftEdgeBrowser {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver;
		
		System.setProperty("webdriver.edge.driver","F:\\microsoft edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000); //It will close after 2 seconds
		driver.close();

	}

}
