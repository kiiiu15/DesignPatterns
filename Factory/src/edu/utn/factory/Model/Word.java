package edu.utn.factory.Model;

public class Word extends Document {


    public Word(String name, String extension) {
        super(name, extension);
    }

    @Override
    public void open() {
        System.out.println("Word: " + getName() + " opened! ");
    }

    @Override
    public void close() {
        System.out.println("Word: " + getName() + " closed! ");
    }

    @Override
    public void save() {
        System.out.println("Word: " + getName() + " saved! ");
    }
}
