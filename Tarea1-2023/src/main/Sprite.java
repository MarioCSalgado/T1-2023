package main;

class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    @Override
    public String degustar(){
        return "sprite";
    }
}