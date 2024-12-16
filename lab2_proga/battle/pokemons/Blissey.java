package lab2.battle.pokemons;

import lab2.battle.move.DazzlingGleam;
import ru.ifmo.se.pokemon.Type;

public final class Blissey extends  Chansey {
    public Blissey(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        int hp = 255;
        int atk = 10;
        int def = 10;
        int spAtk = 75;
        int spDef = 135;
        int speed = 55;
        setStats(hp, atk, def, spAtk, spDef, speed);
        addMove(new DazzlingGleam());
    }
}
