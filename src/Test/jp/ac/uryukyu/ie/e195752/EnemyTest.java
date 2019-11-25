package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        Enemy enemy1 = new Enemy("enemy1",0,3);
        Hero hero1 = new Hero("hero1", 10,5);
        hero1.attack(enemy1);
        enemy1.attack(hero1);

        assertEquals(hero1.hitPoint,10);
    }
}