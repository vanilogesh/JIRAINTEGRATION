package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utils.excelutils.ExcelUtil;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    //Global test data excel file
    public static final String testDataExcelFileName = "testdata.xlsx";


    public WebDriver getDriver() {
        return driver;
    }


    @BeforeClass (description = "Class Level Setup!")
    public void setup () {
        //Create a Chrome driver. All test classes use this.
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vani\\Downloads\\chromedriver.exe");
        
        driver = new ChromeDriver();

        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterClass(description = "Class Level Teardown!")
    public void teardown () {
        driver.quit();
    }

}
