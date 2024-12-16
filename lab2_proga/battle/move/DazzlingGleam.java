package lab2.battle.move;

import ru.ifmo.se.pokemon.*;

public final class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY,80,1);
    }
    @Override
    protected String describe() {
        return "Использует Атаку DazzlingGleam";
    }
}
