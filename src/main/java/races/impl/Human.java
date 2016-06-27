package races.impl;

import annotation.InjectRandomInt;
import races.BaseRace;

public class Human implements BaseRace {

    @InjectRandomInt(min = 2, max = 10)
    private int increasePerWeek;

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public void respondToAction() {
        for (int i = 0; i < increasePerWeek; i++) {
            System.out.println(message);
        }
    }

}
