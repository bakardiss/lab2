package lab2.battle.move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public final class RockSlide extends PhysicalMove {
    private boolean firstMove = true;
    public RockSlide() {
        super(Type.ROCK,75,0.9);

    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        if(firstMove==true) {
            Effect eff = new Effect().chance(0.3);
            eff.flinch(def);
            firstMove = false;
        }
    }
    @Override
    protected String describe() {
        return "Использует Атаку RockSlide";
    }
}
