package main;

public class Tarea1 {
    public static void main(String[] args) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Expendedor exp = new Expendedor(4, 1000);
        Moneda m = null;
        Comprador c = null;

//-----Bebida que NO vende-----
/*Lanza exception por que el codigo no esta en el deposito*/
      /*m = new Moneda100();
        c = new Comprador(m, 657, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());*/ //Si le sacamos los comentarios lanza NoHayProducotException

//-----trata de comprar SIN Moneda-----
    /*Lanza exception por que la moneda es null*/
      /*  m = null;
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());*/// Si le sacamos los comentarios lanza PagoIncorrectoException


//-----con dinero JUSTO para el precio-----
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $0
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $0

//-----con MENOS dinero que el precio-----
/*Lanza exception por que es menos dinero al precio*/
        /* m = new Moneda500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());*///si le sacamos los comentarios lanza PagoInsuficienteException
  


//-----con MAS dinero que el precio-----
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// sprite $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);    
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// sprite $500

//-----Deposito VACIO-----
       /*Lanza Exception por que no hay producto*/
       /*m = new Moneda1500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());*/
      //si le sacamos los comentarios lanza NoHayProductoException 
        
        
//-----Con Mas dinero para comprar Super8-----
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// super8 $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// super8 $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// super8 $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// super8 $500

//-----Con Mas dinero para comprar Trencito-----
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// trencito $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// trencito 500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// trencito $500
        m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// trencito $500
        
       /*Lanza NoHayProductoExpcetion, si le sacamos los comentarios, ya que supera el numero del expendedor*/
       /* m = new Moneda1500();
        c = new Comprador(m, Expendedor.TRENCITO, exp);
        System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());*/
        
    }
}