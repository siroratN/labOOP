public abstract class Bird implements Flyable{
    private double wingSize;
    private double weight;
    private double height;
    public Bird(){
        this(0.0,0.0,0.0);
    }
    public Bird(double wingSize, double weight, double height){
        this.wingSize = wingSize;
        this.height = height;
        this.weight = weight;
    }
    public void eat(double food){
        if (food > 0){
            setWeight(getWeight()+food);
        }
        else{
            System.out.println("Input cannot be negative number.");
        }
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWingSize() {
        return wingSize;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
