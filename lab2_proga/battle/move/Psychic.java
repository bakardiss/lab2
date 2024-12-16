package lab2.battle.move;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.*;

public final class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 90,1);

    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1);
    }
    @Override
    protected String describe() {
        return "Использует Атаку Psychic";
    }
}
