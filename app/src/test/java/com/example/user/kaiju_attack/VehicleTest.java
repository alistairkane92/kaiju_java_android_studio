package com.example.user.kaiju_attack;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/10/2017.
 */

public class VehicleTest {
    Tank tank;
    Jet jet;
    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        tank = new Tank("Big mofo", 500, 10, 5);
        jet = new Jet("Fast mofo", 100, 10, 5);
        godzilla = new Godzilla("Bobzilla", 100, 10);
    }

    @Test
    public void testTankGetters() throws Exception {
        assertEquals("Big mofo", tank.getType());
        assertEquals(500, tank.getHealthValue());
    }

    @Test
    public void testJetGetters() throws Exception {
        assertEquals("Fast mofo", jet.getType());
        assertEquals(100, jet.getHealthValue());
    }

    @Test
    public void tankSetters() throws Exception {
        tank.setType("Bad Tank");
        assertEquals("Bad Tank", tank.getType());

        tank.setHealthValue(50);
        assertEquals(50, tank.getHealthValue());
    }

    @Test
    public void jetSetters() throws Exception {
        jet.setType("Holiday jet");
        assertEquals("Holiday jet", jet.getType());

        jet.setHealthValue(50);
        assertEquals(50, jet.getHealthValue());
    }

    @Test
    public void tankLittleGunDoesDamage() throws Exception {
        tank.littleGunDamage(godzilla);
        assertEquals(95, godzilla.getHealthValue());
    }

    @Test
    public void tankBigGunDoesDamage() {
        tank.bigGunDamage(godzilla);
        assertEquals(90, godzilla.getHealthValue());
    }
}

