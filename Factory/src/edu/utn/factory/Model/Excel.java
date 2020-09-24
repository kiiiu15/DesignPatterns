package edu.utn.factory.Model;

public class Excel extends Document {


    public Excel(String name, String extension) {
        super(name, extension);
    }

    @Override
    public void open() {
        System.out.println("Excel: " + getName() + " opened! ");
    }

    @Override
    public void close() {
        System.out.println("Excel: " + getName() + " closed! ");
    }

    @Override
    public void save() {
        System.out.println("Excel: " + getName() + " saved! ");
    }
}
