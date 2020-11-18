package com.company;

final public class Snake extends Reptile {
    private int speed;
    private double length;

    public Snake(int height, color color, int age, boolean isPoisonous, Located whereLiving, int speed, double length,lair lair,String name) {
        super(height, color, age,isPoisonous,whereLiving,lair,name);
        this.speed= speed;
        this.length = length;
    }

    public int getSpeed() {
        return speed;
    }

    public double getLength() {
        return length;
    }
    public String getInfo(){
        return super.getInfo()+"\nspeed: "+speed+"km/h"+"\nlength: "+length+"metr";
    }
    public void cloning(Object temp){
        if (!(this == temp)) {
            if (temp instanceof Snake) {
                this.speed = ((Snake) temp).speed;
                this.length = ((Snake) temp).length;
            }
        }
    }
}
