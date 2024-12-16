package lab2.battle.move;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC,90, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().chance(0.1);
        eff.paralyze(def);
    }
    @Override
    protected String describe() {
        return "Использует Атаку Thunderbolt";
    }
}

