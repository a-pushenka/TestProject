import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    void test() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}