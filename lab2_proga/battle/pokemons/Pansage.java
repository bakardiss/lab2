package lab2.battle.pokemons;

import lab2.battle.move.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pansage extends Pokemon {
    public Pansage(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        int hp = 50;
        int atk = 53;
        int def = 48;
        int spAtk = 53;
        int spDef = 48;
        int speed = 64;
        setStats(hp, atk, def, spAtk, spDef, speed);
        setMove(new Facade(), new Swagger(), new Confide());
    }
}
