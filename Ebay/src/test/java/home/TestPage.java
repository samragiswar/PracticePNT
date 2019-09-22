package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPage extends CommonAPI {
        @Test
        public void testSearch(){
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(" shoes");
            driver.findElement(By.cssSelector(".btn btn-prim gh-spr")).click();
            driver.navigate().back();

        }


        public void testSignUp(){

        }

    }

