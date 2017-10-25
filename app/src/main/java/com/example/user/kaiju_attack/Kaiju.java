package com.example.user.kaiju_attack;

import com.example.user.kaiju_attack.behaviours.Damageable;


import static android.R.attr.type;

/**
 * Created by user on 25/10/2017.
 */

public abstract class Kaiju implements Damageable {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public String roar(){
        return "ROAR!";
    }

    public void damage(Vehicle vehicle){
        int newHealth = vehicle.getHealthValue() - this.attackValue;
        vehicle.setHealthValue(newHealth);
    }

    public String moveFly(){
        return "I am ";
    }
}
