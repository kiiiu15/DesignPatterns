package edu.utn.factory.Interfaces;

import edu.utn.factory.Exceptions.UnknownDocumentTypeException;

/**
 * This is the interface for the facotry method
 */
public interface IDocumentFactory {

    IDocument getDocument( String name, String extension) throws UnknownDocumentTypeException;
}
