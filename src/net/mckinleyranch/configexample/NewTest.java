package net.mckinleyranch.configexample;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
    //public String exPath = Config.filePath;
    //public String exName = Config.fileName;
    public String exWrSheet = "Logiin Functional Test";
    public Config config;
    
    @BeforeTest
    public void openBrowser(){
        config = new Config();

    	String browser="Mozilla";
    	System.out.println("browser=" + browser);
    	System.out.println("Calling Openbrowser");
   		config.openBrowser(browser);
    }

    @BeforeMethod
    public void navigate(){
    	config=new Config();
    	config.navigate("www.lexmark.com");
    }
    
    /*
    @BeforeTest
    public void openBrowser() {
        config = new Config();
        Excel.setExcelFile(exPath+exName, exWrSheet);
        String browser = Excel.getCellData(1, 2);
        config.openBrowser(browser);
    }

    @BeforeMethod
    public void navigate() {
        config = new Config();
        Excel.setExcelFile(exPath+exName, exWrSheet);
        String baseUrl = Excel.getCellData(2, 2);
        config.navigate(baseUrl);
    }
*/
    @Test
    public void test() {
        System.out.println("Test");
    }
}
/*
    @AfterTest
    public void closeBroser() {
        //Config.tearDown();
    }
    */
    