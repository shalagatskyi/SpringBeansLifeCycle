package races.impl;

import annotation.EvolvedRace;
import annotation.InjectRandomUnits;
import annotation.Profiling;
import org.springframework.stereotype.Component;
import races.BaseRace;

@Component
@Profiling(value = false)
@EvolvedRace(newImpl = Undead.class )
public class Human implements BaseRace {

    @InjectRandomUnits(min = 2, max = 10)
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
