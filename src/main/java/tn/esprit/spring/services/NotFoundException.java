package tn.esprit.spring.services;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}

