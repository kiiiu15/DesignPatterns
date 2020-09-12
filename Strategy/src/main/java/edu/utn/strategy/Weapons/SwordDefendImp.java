package edu.utn.strategy.Weapons;

import edu.utn.strategy.Interfaces.IDefend;

public class SwordDefendImp implements IDefend {
    @Override
    public void defend() {
        System.out.println("Sword defend");
    }
}
