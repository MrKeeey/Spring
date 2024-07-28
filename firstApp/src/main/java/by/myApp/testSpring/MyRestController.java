package by.myApp.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${first.text}")
    private String hello;

    @Value("${my.car}")
    private String nameOfCar;

    @Value("${my.city}")
    private String nameOfCity;

    //private House myHouse;

    @GetMapping("/infocc")
    public String infoOfMyCarAndCity() {
        return "My car: " + nameOfCar + ".\n" + "My city: " + nameOfCity + ".";
    }

    @GetMapping("/")
    public String helloSpring() {
        return hello;
    }

    @GetMapping("/test")
    public String testNewTabSpring() {
        return "New tab with spring is working!";
    }

    @Autowired
    public MyRestController(House myHouse) {
        //this.myHouse = myHouse;
    }

    @GetMapping("/house")
    public String getHouseWindowGlass() {
        //return myHouse.getWindow().getGlass().getGlassName();
        return "Meow";
    }
}