public abstract class Square {
    protected String symbol;
    public Color color;
    public String type;

    public Square(String typeInput){
        type = typeInput;
    }

    String getSymbol(){
        return symbol;
    }
    public Color getColor(){
        return color;
    }
    public String getType(){
        return type;
    }

}


