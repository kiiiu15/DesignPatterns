package edu.utn.strategy.Model;

import edu.utn.strategy.Interfaces.IAtack;
import edu.utn.strategy.Interfaces.IDefend;

public class Gladiator extends Character {


    public Gladiator(IAtack atackWeapon, IDefend defendWeapon) {
        super(atackWeapon, defendWeapon);
    }
}
