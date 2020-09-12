package edu.utn.strategy;


import edu.utn.strategy.Model.Character;
import edu.utn.strategy.Model.Gladiator;
import edu.utn.strategy.Weapons.AxeAtackImp;
import edu.utn.strategy.Weapons.AxeNoDefendImp;
import edu.utn.strategy.Weapons.SwordAtackImp;
import edu.utn.strategy.Weapons.SwordDefendImp;

/**
 * Hello world! This is the main to implment the stategy gof pattern!
 *
 * On the Weapons package  there is the implementations of each weapon of atack and defend.
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Character g = new Gladiator(new SwordAtackImp(), new SwordDefendImp());
        g.atack();
        g.defend();
        g.move("UP", 1);
        g.move("UP", 1);
        g.move("UP", 1);
        System.out.println("Gladiator found axe, change the sword for it");
        g.setAtackWeapon(new AxeAtackImp());
        g.setDefendWeapon(new AxeNoDefendImp());
        g.atack();
        g.defend();
        System.out.println("End!");
    }
}
