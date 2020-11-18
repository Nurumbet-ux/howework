package com.company;

public class Main {

    public static void main(String[] args) {
        Reptile frog = new Reptile(12,color.GREEN,7,true,Located.IN_THE_AIR,new lair("дыра",Located.FOREST,12),"frog of amazonka");
        Snake taeshe = new Snake(12,color.BLACK,10,false,Located.IN_THE_WATER,15,1.2,new lair("тоже какая-то дыра",Located.SWAMP,23),"taeshe of bishkek");
        Snake Asmodeus = new Snake(15,color.YElLOW,12,true,Located.IN_THE_AIR,50,2.2,new lair("большая дыра \uD83D\uDE02",Located.DESERT,45),"Asmodeus");
        System.out.println(frog.getInfo());
        System.out.println(taeshe.getInfo());
        System.out.println(Asmodeus.getInfo());
        Asmodeus.makeVoice("кшышшш");
        frog.makeVoice("!!!","сшшшшш");
        taeshe.makeVoice("!",3,"кссшшыыыы");
        taeshe.cloning(Asmodeus);
        System.out.println(taeshe.getSpeed());
        System.out.println(taeshe.getLength());


    }
}
