package com.agileintelligence.ppmtool.exceptions;

public class
ProjectIdExceptionResponse {
    private String privateIdentifier;

    public ProjectIdExceptionResponse(String privateIdentifier) {
        this.privateIdentifier = privateIdentifier;
    }

    public String getPrivateIdentifier() {
        return privateIdentifier;
    }

    public void setPrivateIdentifier(String privateIdentifier) {
        this.privateIdentifier = privateIdentifier;
    }
}