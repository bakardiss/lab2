package lab2.battle.move;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super();

    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        att.restore();
    }
    @Override
    protected String describe() {
        return "Использует Атаку Rest";
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().turns(2);
        eff.sleep(def);
    }
}
