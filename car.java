public class car implements Comparable<car>   {
    int price;
    int speed;
    String color;
    public car(){

    }
    public car(int price, int speed, String color){
        this.price = price;
        this.speed = speed;
        this.color = color; 
    }
    @Override
    public String toString(){
        return "P: "+ this.price+" S: "+this.speed +" C: "+this.color;
    }
    @Override
    public int compareTo(car o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
