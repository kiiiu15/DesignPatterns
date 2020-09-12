package edu.utn.strategy.Model;

import edu.utn.strategy.Interfaces.IAtack;
import edu.utn.strategy.Interfaces.IDefend;

public class Bowman extends Character {
    public Bowman(IAtack atackWeapon, IDefend defendWeapon) {
        super(atackWeapon, defendWeapon);
    }
}
