package by.myApp.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Window {
    private Glass glass;

    @Autowired
    public Window(Glass glass) {
        System.out.println("My Window!");
        this.glass = glass;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }
}
