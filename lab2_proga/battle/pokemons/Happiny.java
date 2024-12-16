package lab2.battle.pokemons;
import lab2.battle.move.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        int hp = 100;
        int atk = 5;
        int def = 5;
        int spAtk = 15;
        int spDef = 65;
        int speed = 30;
        setStats(hp, atk, def, spAtk, spDef, speed);
        setMove(new Psychic(), new DreamEater());
    }
}
