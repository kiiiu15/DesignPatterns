package edu.utn.strategy.Weapons;

import edu.utn.strategy.Interfaces.IAtack;

public class AxeAtackImp implements IAtack {
    @Override
    public void atack() {
        System.out.println("Axe atack");
    }
}
