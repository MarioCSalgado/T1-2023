
package main;

public class PagoInsuficienteException extends Exception {
    PagoInsuficienteException(String texto){
        super(texto);
    }
}
