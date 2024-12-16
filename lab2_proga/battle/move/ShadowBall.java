package lab2.battle.move;
import ru.ifmo.se.pokemon.*;

public final class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE,-1);
    }
    @Override
    protected String describe() {
        return "Использует Атаку ShadowBall";
    }
}
