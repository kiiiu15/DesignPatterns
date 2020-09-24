package edu.utn.factory.Model;

import edu.utn.factory.Interfaces.IDocument;

import java.util.Objects;

/**
 * This class summons the basic  atributes of each document type
 * It is abstract because it implements the IDocuments interface but it leaves the implementations of its method to thier child classes
 */
public abstract class Document implements IDocument {

    private String name;
    private String extension;


    public Document(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        Document document = (Document) o;
        return Objects.equals(getName(), document.getName()) &&
                Objects.equals(getExtension(), document.getExtension());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getExtension());
    }

    @Override
    public String toString() {
        return "{\"Document\":{"
                + "\"name\":\"" + name + "\""
                + ", \"extension\":\"" + extension + "\""
                + "}}";
    }
}
