package edu.utn.strategy.Model;

import edu.utn.strategy.Interfaces.IAtack;
import edu.utn.strategy.Interfaces.IDefend;

public class Wizard extends Character {
    public Wizard(IAtack atackWeapon, IDefend defendWeapon) {
        super(atackWeapon, defendWeapon);
    }
}
