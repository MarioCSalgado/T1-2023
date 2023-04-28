
package main;


public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String texto) {
        super(texto);
    }
}
