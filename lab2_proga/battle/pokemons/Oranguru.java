package lab2.battle.pokemons;
import lab2.battle.move.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Oranguru extends Pokemon {
    public Oranguru(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC);
        int hp = 65;
        int atk = 60;
        int def = 70;
        int spAtk = 85;
        int spDef = 75;
        int speed = 40;
        setStats(hp, atk, def, spAtk, spDef, speed);
        setMove(new ShadowBall(), new Thunderbolt(), new Rest(), new Extrasensory());
    }
}
