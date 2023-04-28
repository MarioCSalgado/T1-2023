
package main;

import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> be;
    private ArrayList<Dulce> dc;
    private ArrayList<Moneda> mon;
    
    
    public Deposito() {
       this.be = new ArrayList<Bebida>();//deposito bebida
       this.dc= new ArrayList<Dulce>();//deposito dulce
       this.mon= new ArrayList<Moneda>();//deposito moneda
    }
    
    public void addBebida(Producto bebida){
        be.add((Bebida) bebida);
    }
    
    public void addDulce(Producto dulce){
        dc.add((Dulce) dulce);
    }
    
    public int sizeBebida(){
        return be.size();
    }
      public int sizeDulce(){
        return dc.size();
    }
    
    public Bebida getBebida(){
       int tam1= be.size();
       if(tam1!=0){ 
       Bebida b= be.remove(0);
       return b;
       }else{
           return null;
       }
    }
    
    public Dulce getDulce(){
       int tam2= dc.size();
       if(tam2!=0){ 
       Dulce d= dc.remove(0);
       return d;
       }else{
           return null;
       }
    }
    
    public void addMoneda(Moneda moneda){
        mon.add(moneda);
    }
    
    public Moneda getMoneda(){
       int tam= mon.size();
       if(tam!=0){ 
       Moneda mo= mon.remove(0);
       return mo;
       }else{
           return null;
       }
    } 
}
