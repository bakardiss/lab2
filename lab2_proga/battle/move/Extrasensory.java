package lab2.battle.move;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.*;

public final class Extrasensory extends SpecialMove {
    private boolean firstMove = true;
    public Extrasensory() {
        super(Type.PSYCHIC, 80, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        if(firstMove==true) {
            Effect eff = new Effect().chance(0.1);
            eff.flinch(def);
            firstMove = false;
        }
    }
    @Override
    protected String describe() {
        return "Использует Атаку Extrasensory";
    }
}
