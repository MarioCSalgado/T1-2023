package main;

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito super8;
    private Deposito trencito;
    private Deposito monVu;
    public static final int COCA=1; 
    public static final int SPRITE=2;
    public static final int SUPER8=3; 
    public static final int TRENCITO=4;
    private int precios=0;
    private int vuelto=0;
   
    public Expendedor(int productos, int precioProductos) {
        coca = new Deposito();
        sprite = new Deposito();
        super8 = new Deposito();
        trencito = new Deposito();
        monVu = new Deposito();
        precios= precioProductos;

        for (int i = 0; i < productos; i++) {//si el numero de bebidas es 0, no se agregan bebidas
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
            super8.addDulce(new Super8(300+i));
            trencito.addDulce(new Trencito(400+i));
        }
    }
    

    public Producto comprarProducto(Moneda m, int codigo) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        if (m == null) {//si la moneda no es valida         
            throw new PagoIncorrectoException("Su Moneda no es valida");
        }
        if(codigo>4 || codigo<1){
            monVu.addMoneda(m);
            throw new NoHayProductoException("El numero ingresado para el codigo no es valido");
        }
            
        if (precios > m.getSerie().getValor()) { //si los precios son mayores al valor de la moneda, se almacena la moneda y retorna null
            monVu.addMoneda(m); 
            
        } else if (precios <= m.getSerie().getValor()) {//si los precios son menores a la moneda, se almacena el vuelto y se ve los casos para la bebida
           
            switch (codigo) {
                
                case COCA:
                    if (coca.sizeBebida() == 0) {
                        throw new NoHayProductoException("No quedan CocaCola's, los depositos estan vacios");
                    } else {
                        vuelto = m.getSerie().getValor() - precios;
                        int numLoops = vuelto / 100;
                        for (int i = 0; i < numLoops; i++) {
                            monVu.addMoneda(new Moneda100());
                        }

                        return coca.getBebida();
                    }

                case SPRITE:
                    if (sprite.sizeBebida() == 0) {
                        throw new NoHayProductoException("No quedan Sprite's, los depositos estan vacios");
                    } else {
                        vuelto = m.getSerie().getValor() - precios;
                        int numLoops = vuelto / 100;
                        for (int i = 0; i < numLoops; i++) {
                            monVu.addMoneda(new Moneda100());
                        }

                        return sprite.getBebida();
                    }
                case SUPER8:
                    if (super8.sizeDulce() == 0) {
                        throw new NoHayProductoException("No quedan Super8's, los depositos estan vacios");
                    } else {
                        vuelto = m.getSerie().getValor() - precios;
                        int numLoops = vuelto / 100;
                        for (int i = 0; i < numLoops; i++) {
                            monVu.addMoneda(new Moneda100());
                        }

                        return super8.getDulce();
                    
                    }
                case TRENCITO:
                    if (trencito.sizeDulce() == 0) {
                        throw new NoHayProductoException("No quedan Trencito's, los depositos estan vacios");
                    } else {
                        vuelto = m.getSerie().getValor() - precios;
                        int numLoops = vuelto / 100;
                        for (int i = 0; i < numLoops; i++) {
                            monVu.addMoneda(new Moneda100());
                        }

                        return trencito.getDulce();
                    }
          }
        }
        
        throw new PagoInsuficienteException("Pago Insuficiente");// (PagoInsuficienteException)
    }

    public Moneda getVuelto(){
        Moneda mon1= monVu.getMoneda();
        if(mon1==null) return null;
        else return mon1;
    }
}
