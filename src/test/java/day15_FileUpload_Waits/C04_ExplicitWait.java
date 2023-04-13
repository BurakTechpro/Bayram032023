package day15_FileUpload_Waits;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C04_ExplicitWait extends TestBase {
    /*
    https://the-internet.herokuapp.com/dynamic_controls sayfasına gidin
    Remove tuşuna basın
    "It's gone!" yazısını doğrulayın
     */

    @Test
    public void explicitWait(){
//        https://the-internet.herokuapp.com/dynamic_controls sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

//        Add tuşuna basın
        driver.findElement(By.xpath("//button[.='Add']")).click();

//        "It's gone!" yazısını doğrulayın

    }
}