public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){ // getters doesn't tak evalues, but returns values
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
     void setTip(int newTip){ // Setters takes values and returns nothing
        this.tip = newTip;
    }
    
}
