package fr.app.adrien.dice;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Dice {
    private int value;

    public Dice() {
        this.value = 0;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }
}
