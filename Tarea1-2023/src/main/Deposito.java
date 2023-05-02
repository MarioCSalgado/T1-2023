package main;
import java.util.Collections;
import java.util.ArrayList;
<<<<<<< HEAD

class Deposito<T>{
    private ArrayList<T> deposito;
    
    public Deposito() {
       this.deposito = new ArrayList<T>();
    }
    
    public void addDeposito(T producto){
        deposito.add(producto);
    }

    
    public int sizeDeposito(){
        return deposito.size();
    }
    
    public T getDeposito(){
       int tam= deposito.size();
=======
/**
*Clase deposito, simula un deposito donde se guardan las bebidas,dulces y monedas
*@field be Es el es el deposito arraylist de bebidas
*@field dc Es el deposito arraylist de dulces
*@field mon Es el deposito arraylist de monedas
*@field monedas Es el deposito arraylist que igual contiene monedas
*/
class Deposito{
    private ArrayList<Bebida> be;
    private ArrayList<Dulce> dc;
    private ArrayList<Moneda> mon;
    private ArrayList<Moneda> monedas;
     /**
    *Constructor de la clase Deposito, crea las respectivas instancias de los atributos 
    */
    public Deposito() {
       this.be = new ArrayList<Bebida>();//deposito bebida
       this.dc= new ArrayList<Dulce>();//deposito dulce
       this.mon= new ArrayList<Moneda>();//deposito moneda
       this.monedas=new ArrayList<Moneda>();
    }
    /**
    *Metodo que agrega bebidas
    *@param bebida Objeto bebida
    */
    public void addBebida(Producto bebida){
        be.add((Bebida) bebida);
    }
    /**
    *Metodo que agrega los dulces
    *@param dulce Objeto dulce
    */
    public void addDulce(Producto dulce){
        dc.add((Dulce) dulce);
    }
    /**
    *retorna el tamaño de el arraylist bebida
    *@return Numero correpondiente al tamaño del arraylist bebida
    */
    public int sizeBebida(){
        return be.size();
    }
    /**
    *retorna el tamaño de el arraylist dulce
    *@return Numero correpondiente al tamaño del arraylist dulce
    */  
      public int sizeDulce(){
        return dc.size();
    }
     /**
    *Metodo que obtiene el objeto bebida en caso de no estar vacio su arraylist
    *@return El objeto bebida o null
    */
    public Bebida getBebida(){
       int tam1= be.size();
       if(tam1!=0){ 
       Bebida b= be.remove(0);
       return b;
       }else{
           return null;
       }
    }
     /**
    *Metodo que obtiene el objeto dulce en caso no estar vacio su arraylist
    *@return El objeto dulce o null
    */
    public Dulce getDulce(){
       int tam2= dc.size();
       if(tam2!=0){ 
       Dulce d= dc.remove(0);
       return d;
       }else{
           return null;
       }
    }
     /**
    *Metodo que agrega monedas a su arraylist respectivo
    *@param moneda Es El objeto moneda que recibe para agregarlo a su arraylist
    */
    public void addMoneda(Moneda moneda){
        mon.add(moneda);
        monedas.add(moneda);
    }
    /**
    *Metodo que retorna una moneda del arraylist respectivo de las monedas
    *@return retorna el objeto Moneda, su referencia o null en caso de estar vacio su arraylist 
    */ 
    public Moneda getMoneda(){
       int tam= mon.size();
>>>>>>> 9963f11403fad255feaf2b45f9cfefee51e4bae1
       if(tam!=0){ 
       T producto= deposito.remove(0);
       return producto;
       }else{
           return null;
       }
    }
<<<<<<< HEAD
=======
    /** 
    *Metodo que retorna un listado Arraylist de monedas almacenadas
    */
    public ArrayList<Moneda> getMonedas(){
        return monedas;
    } 
>>>>>>> 9963f11403fad255feaf2b45f9cfefee51e4bae1
}
