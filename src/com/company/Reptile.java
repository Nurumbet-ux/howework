package com.company;


import java.util.Arrays;

public class Reptile extends Animal {
    private boolean isPoisonous;
    private Located whereLiving;

    public Reptile(int height, color color, int age, boolean isPoisonous, Located whereLiving,lair lair,String name) {
        super(height, color, age,lair,name);
        this.isPoisonous = isPoisonous;
        this.whereLiving = whereLiving;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public Located getWhereLiving() {
        return whereLiving;
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public void makeVoice(String bol, String voice){
        System.out.println(voice+""+bol);
    }
    public void makeVoice(String bol,int naskolko,String voice){
        for (int i = 0; i < naskolko; i++) {
            System.out.println(voice+""+bol);
        }
    }
   final public void poison(Animal temp){
        if (isPoisonous) {
            temp.setAge(0);
            System.out.println(super.getName()+ " is dead");
        }
    }
    public String getInfo(){
        return "                              " +
                "                              \nname: "+super.getName()+ "\n" +
                "_______________________________________\nage: "+getAge()+"\ncolor: "+getColor()+"\nheight: "+getHeight()+"\nis poisonous: "+isPoisonous+"\nwhere living: "+whereLiving+"\nlair name: " +
                ""+ super.getLair().getName()+"\nlair location: "+super.getLair().getLocated()+"\nlair capacity: "+super.getLair().getCapacity();
    }



}
