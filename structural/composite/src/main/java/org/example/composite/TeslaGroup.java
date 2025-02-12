package org.example.composite;

import java.util.List;

public class TeslaGroup implements Tesla {

    private List<Tesla> teslaGroup;

    public void add(Tesla tesla) {
        this.teslaGroup.add(tesla);
    }

    @Override
    public void getDetail() {

    }
}
