package edu.utn.AbstractFactory.Model.Factories;

import edu.utn.AbstractFactory.Interfaces.AbstractFactory;
import edu.utn.AbstractFactory.Interfaces.IDesktopForm;
import edu.utn.AbstractFactory.Interfaces.IWebForm;
import edu.utn.AbstractFactory.Model.Forms.ASPForm;
import edu.utn.AbstractFactory.Model.Forms.WinForm;

public class NetFactory implements AbstractFactory {
    @Override
    public IWebForm createWebForm() {
        return new ASPForm();
    }

    @Override
    public IDesktopForm createDesktopForm() {
        return new WinForm();
    }
}
