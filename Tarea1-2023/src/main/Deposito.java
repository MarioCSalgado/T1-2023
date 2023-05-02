package main;

import java.util.ArrayList;

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
       if(tam!=0){ 
       T producto= deposito.remove(0);
       return producto;
       }else{
           return null;
       }
    }
}
