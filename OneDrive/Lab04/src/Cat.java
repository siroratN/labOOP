public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;
    private void setWeight(double w){
        weight = w;
    }
    private void setheight(double h){
        height = h;
    }
    private void setName(String n){
        name = n;
        
    }
    private void setColor(String c){
        color = c;
    }
    public void upWeight(double w){
        if (w >= 0){
            weight = w;
        }
        else{
            System.out.println("Error");
        }
    }
    public void downWeight(double w){
        if (w >= 0){
            weight = w;
        }
        else{
            System.out.println("Error");
        }
    }
    public void upHeight(double h){
        if (h >= 0){
            height = h;
        }
        else{
            System.out.println("error");
        }
    }
    public void defineCat(String n, String c){
        name = n;
        color = c;
    }
    public void speak(){
        System.out.println("Name : "+name);
        System.out.println("Color : "+color);
        System.out.println("Height : "+height);
        System.out.println("Weight : "+weight);
    }
}
