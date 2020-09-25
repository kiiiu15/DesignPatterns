package edu.utn.AbstractFactory;

import edu.utn.AbstractFactory.Interfaces.AbstractFactory;
import edu.utn.AbstractFactory.Interfaces.IForm;
import edu.utn.AbstractFactory.Model.AbstractFactory.FormFactoryFactory;

public class Main {

    public static void main(String[] args) {
        FormFactoryFactory formFactoryFactory = new FormFactoryFactory();
        AbstractFactory abstractFactory = formFactoryFactory.createFactory("java");
        IForm form = abstractFactory.createDesktopForm();
        form.show();

    }
}
