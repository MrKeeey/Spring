package by.myApp.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {

    private Window window;

    @Autowired
    public House(Window window) {
        System.out.println("My House!");
        this.window = window;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }
}
