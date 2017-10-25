package com.example.user.kaiju_attack;

/**
 * Created by user on 25/10/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move(){
        return super.moveFly() + "moving";
    }
}
