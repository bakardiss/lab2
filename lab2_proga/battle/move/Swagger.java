package lab2.battle.move;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 0.85);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.confuse(p);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
    }
}
