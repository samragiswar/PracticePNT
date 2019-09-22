package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class HomeTest extends CommonAPI{

    @Test
    public void testSearch(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(" camera");
        driver.findElement(By.cssSelector(".global-search-form")).click();
        driver.navigate().back();

    }


    public void testSignUp(){

    }

}


}
