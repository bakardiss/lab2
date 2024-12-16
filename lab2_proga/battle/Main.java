package lab2.battle;

import lab2.battle.pokemons.*;


import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Oranguru("Артём", 1);
        Pokemon p2 = new Pansage("Иван", 1);
        Pokemon p3 = new Simisage("Алексей", 1);
        Pokemon p4 = new Happiny("Егор", 1);
        Pokemon p5 = new Chansey("Максим", 1);
        Pokemon p6 = new Blissey("Влад", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p6);
        b.go();
    }
}