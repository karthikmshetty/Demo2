import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parameter_jenkin_Test {

	@Test
	public void method1test() {
		String Browser = System.getProperty("browser");
		String Url= System.getProperty("url");
		System.out.println(Browser);
		System.out.println(Url);

		
//		WebDriver driver;
//		if (Browser.contains("chrome")) {
//			driver = new ChromeDriver();
//
//		} else {
//			driver = new EdgeDriver();
//		}
//		driver.get(Url);

	}
}
