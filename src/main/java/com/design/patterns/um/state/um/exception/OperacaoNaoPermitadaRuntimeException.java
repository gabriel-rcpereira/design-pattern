package com.design.patterns.um.state.um.exception;

public class OperacaoNaoPermitadaRuntimeException extends RuntimeException {

    public OperacaoNaoPermitadaRuntimeException() {
    }

    public OperacaoNaoPermitadaRuntimeException(String message) {
        super(message);
    }
}
