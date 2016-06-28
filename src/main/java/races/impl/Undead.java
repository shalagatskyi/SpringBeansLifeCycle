package races.impl;

import races.BaseRace;

public class Undead implements BaseRace {

    @Override
    public void setMessage(String message) {}

    @Override
    public String getMessage() {
        return "Нужно больше зиггуратов!";
    }

    @Override
    public void respondToAction() {
        System.out.println("Нужно больше зиггуратов!");
    }
}
