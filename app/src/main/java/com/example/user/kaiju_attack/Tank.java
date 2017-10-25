package com.example.user.kaiju_attack;

import com.example.user.kaiju_attack.behaviours.VehicleAttack;

/**
 * Created by user on 25/10/2017.
 */

public class Tank extends Vehicle implements VehicleAttack{

    public Tank(String type, int healthValue, int littleGunValue, int bigGunValue) {
        super(type, healthValue, littleGunValue, bigGunValue);
    }
}
