package edu.utn.factory.Exceptions;

public class UnknownDocumentTypeException  extends Throwable{

    public UnknownDocumentTypeException() {
    }

    public UnknownDocumentTypeException(String message) {
        super(message);
    }
}
