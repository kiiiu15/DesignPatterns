package edu.utn.factory.Model;

import edu.utn.factory.Exceptions.UnknownDocumentTypeException;
import edu.utn.factory.Interfaces.IDocument;
import edu.utn.factory.Interfaces.IDocumentFactory;

/**
 * This is the class responsible for creating the documents implements IDocuments facorty because it is the interfaces the client has access to
 */
public class DocumentFactory implements IDocumentFactory {
    @Override
    public IDocument getDocument(String name, String extension) throws UnknownDocumentTypeException {

        switch (extension) {

            case "doc":
                return new Word(name, extension);


            case "pdf":
                return new PDF(name, extension);


            case "xslx":
                return new Excel(name, extension);

            default:
                throw new UnknownDocumentTypeException("The extension expecified is not know by the system");

        }

    }
}
