package edu.utn.factory.Interfaces;

/**
 * This is the interface for the facotry method
 */
public interface IDocumentFactory {

    IDocument getDocument( String name, String extension);
}
