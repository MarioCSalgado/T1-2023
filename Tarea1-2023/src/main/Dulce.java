
package main;

/********Dulce********/
abstract class Dulce extends Producto{//no se puede instanciar directamente
    public Dulce(int serie){
        super(serie);
    }  
}


class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);
    }
    @Override
    public String degustar(){
        return "Super8";
    }
}

class Trencito extends Dulce{
    public Trencito(int serie){
        super(serie);
    }
    @Override
    public String degustar(){
        return "Trencito";
    }
}