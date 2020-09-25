package edu.utn.AbstractFactory.Model.Factories;

import edu.utn.AbstractFactory.Interfaces.AbstractFactory;
import edu.utn.AbstractFactory.Interfaces.IDesktopForm;
import edu.utn.AbstractFactory.Interfaces.IWebForm;
import edu.utn.AbstractFactory.Model.Forms.JSPForm;
import edu.utn.AbstractFactory.Model.Forms.JavaForm;

public class JavaFactory implements AbstractFactory {
    @Override
    public IWebForm createWebForm() {
        return new JSPForm();
    }

    @Override
    public IDesktopForm createDesktopForm() {
        return new JavaForm();
    }
}
