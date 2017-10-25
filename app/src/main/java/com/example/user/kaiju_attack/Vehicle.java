package com.example.user.kaiju_attack;

import com.example.user.kaiju_attack.behaviours.Damageable;
import com.example.user.kaiju_attack.behaviours.VehicleAttack;

/**
 * Created by user on 25/10/2017.
 */

public abstract class Vehicle implements VehicleAttack {

    private String type;
    private int healthValue;
    private int bigGunValue;
    private int littleGunValue;

    public Vehicle(String type, int healthValue, int bigGunValue, int littleGunValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.bigGunValue = bigGunValue;
        this.littleGunValue = littleGunValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void bigGunDamage(Kaiju kaiju){
        int newHealth = kaiju.getHealthValue() - this.bigGunValue;
        kaiju.setHealthValue(newHealth);
    }

    public void littleGunDamage(Kaiju kaiju){
        int newHealth = kaiju.getHealthValue() - this.littleGunValue;
        kaiju.setHealthValue(newHealth);
    }
}
