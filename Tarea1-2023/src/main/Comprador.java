
package main;

/*******Comprador*******/
class Comprador{
    private String sonido;
    private int vuelto=0;

    public Comprador(Moneda m, int cualExpende, Expendedor exp) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {//1500,1400
        Producto pd= exp.comprarProducto(m,cualExpende);
        
        if(pd != null){
            sonido=pd.degustar();
        }
        
        Moneda monedaOut= exp.getVuelto();
              
         while(monedaOut != null){
            this.vuelto= vuelto + monedaOut.getValor();
            monedaOut=exp.getVuelto();
        }
    }
    
    public int cuantoVuelto(){
        return vuelto;
    }
    
    public String queDegustaste(){
        return sonido;
    }

}
