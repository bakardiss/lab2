package lab2.battle.move;

import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "Использует Confide";
    }
}
