import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parameter_jenkin {

	@Test()
	public void method1()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
		WebDriver driver;
if(BROWSER.contains("chrome"))		
{
	driver=new ChromeDriver();
	
	}
else
{
	driver=new EdgeDriver();
	}
driver.get(URL);
		
		
	}
}
