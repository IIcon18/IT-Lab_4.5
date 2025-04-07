package org.example.peripherals;


import org.springframework.stereotype.Component;

@Component
public class GraphicsTablet implements Peripheral {
    @Override
    public String getModel() {
        return "Professional Graphics Tablet";
    }
}
