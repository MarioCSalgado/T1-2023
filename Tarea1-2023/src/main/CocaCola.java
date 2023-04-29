
package main;

class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    @Override
    public String degustar(){
        return "cocacola";
    }
}
