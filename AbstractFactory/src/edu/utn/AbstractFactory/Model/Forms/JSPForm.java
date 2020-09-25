package edu.utn.AbstractFactory.Model.Forms;

import edu.utn.AbstractFactory.Interfaces.IWebForm;

import java.util.Random;

public class JSPForm implements IWebForm {
    @Override
    public Integer timeOut() {
        return new Random().nextInt();
    }

    @Override
    public void show() {
        System.out.println("This is a java web form");
    }
}
