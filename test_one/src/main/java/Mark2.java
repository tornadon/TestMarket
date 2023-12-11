import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.BasicConfigurator;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Mark2 {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        WebDriver  Chrome = new ChromeDriver();
        Chrome.get("https://ya.ru/");
        Chrome.manage().window().maximize();
        Chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Chrome.findElement((By.xpath("//input[@class='search3__input mini-suggest__input']"))).click();
            Chrome.findElement((By.xpath("//a[contains(@data-id,'market')]"))).click();
             for (String tab : Chrome.getWindowHandles()) {
                 Chrome.switchTo().window(tab);
             }
            Chrome.findElement((By.xpath("//button[@class='V9Xu6 button-focus-ring _1KI8u Lfy7z _3iB1w _35Vhw']"))).click();
            WebElement we = Chrome.findElement(By.xpath("//a[@class='_1010X']/span[contains(text(),'Электроника')]"));
            Actions actions = new Actions(Chrome);
            actions.moveToElement(we).perform();
            Chrome.findElement(By.xpath("//a[@href='/catalog--smartfony/26893750/list?hid=91491&glfilter=21194330%3A34066443']")).click();

            Chrome.findElement(By.xpath("//label[contains(text() ,'Цена, ₽')]/..//*[@class='_3qxDp _1R_cW']")).sendKeys("20000");
            Chrome.findElement(By.xpath("//span[@class='_2rlLb']/span[contains(text(),'Apple')]")).click();
            Chrome.findElement(By.xpath("//span[@class='_2rlLb']/span[contains(text(),'Xiaomi')]")).click();
            Chrome.findElement(By.xpath("//span[@class='_2rlLb']/span[contains(text(),'Samsung')]")).click();
            Chrome.findElement(By.xpath("//span[@class='_2rlLb']/span[contains(text(),'realme')]")).click();
            Chrome.findElement(By.xpath("//span[@class='_2rlLb']/span[contains(text(),'HONOR')]")).click();
            Chrome.findElement(By.xpath("//span[@class='_1ZDAA'][contains(text(),'3.5')]")).click();
            String currentpage = Chrome.getCurrentUrl();
            Chrome.get(currentpage);
            String phone = Chrome.findElement(By.xpath("//div[@data-index='1']//h3[@data-zone-name='title']//span")).getText();
            Chrome.findElement(By.xpath("//div[@class='_16jig']//button[@class='_23p69 _3D8AA cia-vs cia-cs']"));
            WebElement phone2 = Chrome.findElement(By.xpath("//span[contains(text(),'"+phone+"')]"));
            actions.scrollToElement(phone2).perform();
            phone2.click();
            for (String tab : Chrome.getWindowHandles()) {
                Chrome.switchTo().window(tab);
            }
             String rating =Chrome.findElement(By.xpath("//span[@class='ybvaC']")).getText();

            System.out.println (rating)  ;
            Chrome.quit();

        }
            catch (Exception e){
                e.printStackTrace();
            }
    }
}
