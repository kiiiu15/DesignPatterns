package edu.utn.strategy.Model;

import edu.utn.strategy.Interfaces.IAtack;
import edu.utn.strategy.Interfaces.IDefend;

public abstract class Character {

    private IAtack atackWeapon;
    private IDefend defendWeapon;

    public  void Move(String direction, Integer speed){
        System.out.println("The caracter moved to " + direction + " with a speed of " + speed);
    }

    public void atack(){
        this.atackWeapon.atack();
    }

    public void defend(){
        this.defendWeapon.defend();
    }

}
