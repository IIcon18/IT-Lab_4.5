package org.example.main;


import org.example.peripherals.Peripheral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class PeripheralManager {
    private final List<Peripheral> peripherals;

    @Autowired
    public PeripheralManager(List<Peripheral> peripherals) {
        this.peripherals = peripherals;
    }

    public void printModels() {
        for (Peripheral peripheral : peripherals) {
            System.out.println("Peripheral model: " + peripheral.getModel());
        }
    }
}

