package edu.utn.AbstractFactory.Model.AbstractFactory;

import edu.utn.AbstractFactory.Interfaces.AbstractFactory;
import edu.utn.AbstractFactory.Interfaces.AbstractFormFactory;
import edu.utn.AbstractFactory.Model.Factories.JavaFactory;
import edu.utn.AbstractFactory.Model.Factories.NetFactory;

public class FormFactoryFactory implements AbstractFormFactory {


    @Override
    public AbstractFactory createFactory(String type) {

        if ("java".equalsIgnoreCase(type)) {
            return new JavaFactory();
        } else {

            if ("net".equalsIgnoreCase(type)) {
                return new NetFactory();
            } else {
                return null;
            }
        }

    }
}
