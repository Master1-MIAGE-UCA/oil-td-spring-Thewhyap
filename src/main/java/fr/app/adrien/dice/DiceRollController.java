package fr.app.adrien.dice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "DiceRoll", description = "API for Dice Roll Game")
public class DiceRollController {

    @Autowired
    private DiceRollLogService diceRollLogService;

    // Endpoint pour lancer un seul dé
    @GetMapping("/rollDice")
    @Operation(summary = "Roll a dice", description = "Roll a dice and return the result")
    public List<Integer> rollDice() {
        return diceRollLogService.rollDice(1);
    }

    // Endpoint pour lancer X dés
    @GetMapping("/rollDices/{X}")
    @Operation(summary = "Roll X dices", description = "Roll X dices and return the results")
    public List<Integer> rollDices(@PathVariable int X) {
        return diceRollLogService.rollDice(X);
    }
}

