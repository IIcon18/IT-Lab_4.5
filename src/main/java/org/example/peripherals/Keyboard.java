package org.example.peripherals;

import org.springframework.stereotype.Component;


@Component
public class Keyboard implements Peripheral {
    @Override
    public String getModel() {
        return "Mechanical Keyboard";
    }
}

