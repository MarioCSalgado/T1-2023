package main;

public class Tarea1 {
    public static void main(String[] args) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Expendedor exp = new Expendedor(4, 1000);
        Moneda m = null;
        Comprador c = null;

//-----Bebida que NO vende-----
        m = new Moneda1500();
        c = new Comprador(m, 657, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500
        m = new Moneda1500();
        c = new Comprador(m, 657, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500
        m = new Moneda1500();
        c = new Comprador(m, 657, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500
        m = new Moneda1500();
        c = new Comprador(m, 657, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500

//-----trata de comprar SIN Moneda-----
   /*    m = null;
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $0
        m = null;
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $0
        m = null;
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $0
        m = null;
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $0*/

//-----con dinero JUSTO para el precio-----
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// cocacola $0

//-----con MENOS dinero que el precio-----
   /*    m = new Moneda500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500
        m = new Moneda500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500
        m = new Moneda500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500
        m = new Moneda500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $500
*/
//-----con MAS dinero que el precio-----
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// sprite $500

//-----Deposito VACIO-----
       /* m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $1500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $1500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $1500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// null $1500
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());//// null $1500*/
        
        
        /*****************************/
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// super8 $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// super8 $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// super8 $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// super8 $500
        /*m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// super8 $500*/
        
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// trencito $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// trencito 500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// trencito $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// trencito $500
        
       /* m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());// sprite $500*/
        
    }
}