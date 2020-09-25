package edu.utn.AbstractFactory.Model.Forms;

import edu.utn.AbstractFactory.Interfaces.IDesktopForm;

import java.util.Random;

public class WinForm implements IDesktopForm {
    @Override
    public boolean isModal() {
        return new Random().nextBoolean();
    }

    @Override
    public void show() {
        System.out.println("This is a net desktop form");
    }
}
