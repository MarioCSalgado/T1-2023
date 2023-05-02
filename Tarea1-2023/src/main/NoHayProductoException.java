
package main;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(String texto){
        super(texto);
    }
}
