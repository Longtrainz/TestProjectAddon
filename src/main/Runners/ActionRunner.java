package main.Runners;

import io.testproject.java.classes.DriverSettings;
import io.testproject.java.enums.DriverType;
import io.testproject.java.sdk.v2.Runner;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import main.Addon.ClickMenuLinks;

public class ActionRunner {


    private final static String devToken = "NGRb1GbU7-OPkSJchaNHPHkkRUHRbUPKlVmQV4bWeaI1";

    public static void main(String[] args) throws Exception{
        DriverSettings driverSettings = new DriverSettings(DriverType.Chrome);

        try(Runner runner = new Runner(devToken, driverSettings)){

            ClickMenuLinks clickMenuLinks = new ClickMenuLinks();

            WebDriver driver = runner.getDriver(clickMenuLinks);
            driver.navigate().to("http://eaapp.somee.com/");

            //Click all the menu items of the menu
            runner.run(clickMenuLinks);

        }
    }

}
