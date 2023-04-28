
package main;

/*******Comprador*******/
class Comprador{
    private String sonido;
    private int vuelto=0;
//Duda es necesario poner throws en comprador?
    public Comprador(Moneda m, int cualExpende, Expendedor exp) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {//1500,1400
        Producto pd= exp.comprarProducto(m,cualExpende);
        
        if(pd != null){
            sonido=pd.degustar();
        }
        
        Moneda monedin= exp.getVuelto();
              
         while(monedin != null){
            this.vuelto= vuelto + monedin.getValor();
            monedin=exp.getVuelto();
        }
    }
    
    public int cuantoVuelto(){
        return vuelto;
    }
    
    public String queBebiste(){
        return sonido;
    }
    
    public String queComiste(){
        return sonido;
    }
}
