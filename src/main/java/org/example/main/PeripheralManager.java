package org.example.main;

import org.example.peripherals.GraphicsTablet;
import org.example.peripherals.Headphones;
import org.example.peripherals.Keyboard;
import org.example.peripherals.Peripheral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class PeripheralManager {
    private final List<Peripheral> peripherals;

    @Autowired
    public PeripheralManager(Keyboard keyboard, Headphones headphones, GraphicsTablet graphicsTablet) {
        this.peripherals = List.of(keyboard, headphones, graphicsTablet);
    }

    public void printModels() {
        for (Peripheral peripheral : peripherals) {
            System.out.println("Peripheral model: " + peripheral.getModel());
        }
    }
}