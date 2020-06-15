package Day47_Abstraction;

public class Driver_Objects {
    public static void main(String[] args) {
        String URL = "https://www.google.com";
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);


        //When a regular class extends abstract class, it is require (MUST) all abstract methods

        //However, if extends class is abstract,too, you dont need to override.Optional
        // we did't make it abstract, because we cannot create an object when it is abstract.

        driver.quit();

        System.out.println("=========================================");

        FireFox_Driver driver2 = new FireFox_Driver();
        driver2.get("https://www.google.com");
        driver2.quit();

        System.out.println("=========================================");

        Opera_Driver driver3 = new Opera_Driver();
        driver3.get("https://www.google.com");
        driver3.quit();

    }
}
