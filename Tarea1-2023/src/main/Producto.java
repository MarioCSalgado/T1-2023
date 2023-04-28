
package main;

abstract class Producto{//no se puede instanciar directamente
    private int serie;
    
    public Producto(int prueba){
       this.serie=prueba;
    }

    public int getSerie(){
       return serie;
    }

    public abstract String degustar();   
}


