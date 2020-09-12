package edu.utn.strategy.Weapons;

import edu.utn.strategy.Interfaces.IAtack;

public class SwordAtackImp implements IAtack {
    @Override
    public void atack() {
        System.out.println("Sword atacked");
    }
}
