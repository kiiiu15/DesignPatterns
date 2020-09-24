package edu.utn.factory.Model;

public class PDF extends Document {

    public PDF(String name, String extension) {
        super(name, extension);
    }

    @Override
    public void open() {
        System.out.println("PDF: " + getName() + " opened! ");
    }

    @Override
    public void close() {
        System.out.println("PDF: " + getName() + " closed! ");
    }

    @Override
    public void save() {
        System.out.println("PDF: " + getName() + " saved! ");
    }
}
