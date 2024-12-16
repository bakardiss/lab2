package lab2.battle.move;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    private Status pstatus;
    public Facade() {
        super(Type.NORMAL,70,1);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        pstatus = att.getCondition();
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if(pstatus == Status.BURN || pstatus == Status.POISON || pstatus == Status.PARALYZE) {
            damage *= 2;
        }
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "Использует Атаку Facade";
    }
}
