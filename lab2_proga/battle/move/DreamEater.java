package lab2.battle.move;

import ru.ifmo.se.pokemon.*;

public final class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 1);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        if (def.getCondition() == Status.SLEEP){
            return (accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION)) > Math.random();
        }else {
            System.out.print("Вражеский покемон не спит. ");
            return false;
        }
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        int hp = (int) att.getHP();
        att.restore();
        int nhp = (int) ((att.getHP() - hp) / 2);
        att.setMod(Stat.HP, nhp);
        System.out.printf("Востанавливает " + nhp + " здоровье");
    }
    @Override protected String describe() {
        return "Использует Dream Eater";
    }
}