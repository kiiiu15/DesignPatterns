package edu.utn.factory;

import edu.utn.factory.Exceptions.UnknownDocumentTypeException;
import edu.utn.factory.Interfaces.IDocument;
import edu.utn.factory.Interfaces.IDocumentFactory;
import edu.utn.factory.Model.Document;
import edu.utn.factory.Model.DocumentFactory;

/**
 * The main class contains hte main method, which acts as a client to use our system.
 */
public class Main {

    public static void main(String[] args) {

        try {
            IDocumentFactory factory = new DocumentFactory();
            IDocument document = factory.getDocument("test", "doc");
            document.open();
            document.save();
            document.close();
        }catch (UnknownDocumentTypeException ex){
            System.out.println(ex.getMessage());
        }


    }
}
