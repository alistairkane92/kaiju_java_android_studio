package com.example.user.kaiju_attack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/10/2017.
 */

public class KaijuTest {
    Godzilla godzilla;
    KingKong kingKong;
    Vehicle tank;

    @Before
    public void setUp() throws Exception {
        godzilla = new Godzilla("Riatsila", 500, 50);
        kingKong = new KingKong("Kim Jong", 250, 25);
        tank = new Tank("BigMofo", 300, 50, 25);
    }

    @Test
    public void godzillaGetters() throws Exception {
        assertEquals("Riatsila", godzilla.getName());
        assertEquals(500, godzilla.getHealthValue());
        assertEquals(50, godzilla.getAttackValue());
    }

    @Test
    public void godZillaSetters() throws Exception {
        godzilla.setHealthValue(4);
        assertEquals(4, godzilla.getHealthValue());

        godzilla.setAttackValue(3);
        assertEquals(3, godzilla.getAttackValue());

        godzilla.setName("Gadszilla");
        assertEquals("Gadszilla", godzilla.getName());
    }

    @Test
    public void kingKongGetters() throws Exception {
        assertEquals("Kim Jong", kingKong.getName());
        assertEquals(250, kingKong.getHealthValue());
        assertEquals(25, kingKong.getAttackValue());
    }


    @Test
    public void kingKongSetters() throws Exception {
        kingKong.setHealthValue(4);
        assertEquals(4, kingKong.getHealthValue());

        kingKong.setAttackValue(3);
        assertEquals(3, kingKong.getAttackValue());

        kingKong.setName("Ping Pong");
        assertEquals("Ping Pong", kingKong.getName());

    }



    @Test
    public void kaijuCanRoar() throws Exception {
        assertEquals("ROAR!", godzilla.roar());
        assertEquals("ROAR!", kingKong.roar());
    }

    @Test
    public void godzillaCanMove() throws Exception {
        assertEquals("I am moving", godzilla.move());
    }

    @Test
    public void kingKongCanMove() throws Exception {
        assertEquals("I am jumping", kingKong.move());
    }

    @Test
    public void canGodzillaDoDamage(){
        godzilla.damage(tank);
        assertEquals(250, tank.getHealthValue());
    }

    @Test
    public void canKingKongDoDamage(){
        kingKong.damage(tank);
        assertEquals(275, tank.getHealthValue());
    }

}
