package races.impl;

import races.BaseRace;

public class Human implements BaseRace {

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
        System.out.println(message);
    }

}
