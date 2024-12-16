package lab2.battle.move;

import ru.ifmo.se.pokemon.*;

public final class MudBomb extends SpecialMove {
    public MudBomb() {
        super(Type.GROUND, 65, 0.85);

    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().chance(0.3).stat(Stat.ACCURACY,-1);
    }
    @Override
    protected String describe() {
        return "Использует Атаку MudBomb";
    }
}
