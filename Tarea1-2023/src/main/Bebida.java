
package main;

/********Bebida********/
abstract class Bebida extends Producto{//no se puede instanciar directamente
    public Bebida(int serie){
        super(serie);
    }  
}

//"sabor: "+"sprite";
class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    @Override
    public String degustar(){
        return "sprite";
    }
}

class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    @Override
    public String degustar(){
        return "cocacola";
    }
}