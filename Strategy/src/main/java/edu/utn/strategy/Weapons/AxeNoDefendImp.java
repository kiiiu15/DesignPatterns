package edu.utn.strategy.Weapons;

import edu.utn.strategy.Interfaces.IDefend;

public class AxeNoDefendImp implements IDefend {
    @Override
    public void defend() {
        System.out.println("I'm an axe, i cant defend!");
    }
}
