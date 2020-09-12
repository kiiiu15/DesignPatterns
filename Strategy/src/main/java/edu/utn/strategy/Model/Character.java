package edu.utn.strategy.Model;

import edu.utn.strategy.Interfaces.IAtack;
import edu.utn.strategy.Interfaces.IDefend;


/**
 *  This class is to implement the actack and defend method that may vary depending on the weapon they carry.
 *
 *  Each one, atack and defend are both  stategys patterns.
 */
public  class Character {

    private IAtack atackWeapon;
    private IDefend defendWeapon;

    public void move(String direction, Integer speed){
        System.out.println("The caracter moved to " + direction + " with a speed of " + speed);
    }

    public void atack(){
        this.atackWeapon.atack();
    }

    public void defend(){
        this.defendWeapon.defend();
    }

    public Character(IAtack atackWeapon, IDefend defendWeapon) {
        this.atackWeapon = atackWeapon;
        this.defendWeapon = defendWeapon;
    }


    public IAtack getAtackWeapon() {
        return atackWeapon;
    }

    public void setAtackWeapon(IAtack atackWeapon) {
        this.atackWeapon = atackWeapon;
    }

    public IDefend getDefendWeapon() {
        return defendWeapon;
    }

    public void setDefendWeapon(IDefend defendWeapon) {
        this.defendWeapon = defendWeapon;
    }
}
