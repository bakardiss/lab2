package lab2.battle.pokemons;

import lab2.battle.move.*;
import ru.ifmo.se.pokemon.Type;

public final class Simisage extends Pansage {
    public Simisage(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        int hp = 75;
        int atk = 98;
        int def = 63;
        int spAtk = 98;
        int spDef = 63;
        int speed =101;
        setStats(hp, atk, def, spAtk, spDef, speed);
        addMove(new RockSlide());
    }
}
