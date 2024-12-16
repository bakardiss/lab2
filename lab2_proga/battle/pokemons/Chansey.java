package lab2.battle.pokemons;

import lab2.battle.move.DreamEater;
import lab2.battle.move.MudBomb;
import lab2.battle.move.Psychic;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        int hp = 250;
        int atk = 5;
        int def = 5;
        int spAtk = 35;
        int spDef = 105;
        int speed = 50;
        setStats(hp, atk, def, spAtk, spDef, speed);
        addMove(new MudBomb());
    }

}
