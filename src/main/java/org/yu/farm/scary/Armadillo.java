package org.yu.farm.scary;

import org.yu.farm.Animal;
import org.yu.farm.AnimalType;

public class Armadillo extends ScaryAnimal {

    public Armadillo(String name) {
        super(AnimalType.ARMADILLO, name);
    }


    @Override
    public void makeNoise() {
        System.out.println("shhh.  armadillos are silent...");
    }
    @Override
    public void eatUnderYonderTree() {
        System.out.println("nibble nibble");
    }
}
