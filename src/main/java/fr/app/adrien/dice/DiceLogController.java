package fr.app.adrien.dice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "DiceRollLog", description = "The Dice Roll Log API")
public class DiceLogController {

    @Autowired
    private DiceRollLogRepository diceRollLogRepository;

    /**
     * Endpoint pour retourner l'historique des lancés de dés.
     * @return Liste de tous les enregistrements DiceRollLog.
     */
    @GetMapping("/diceLogs")
    @Operation(summary = "Get all dice logs", description = "Get all dice logs")
    public List<DiceRollLog> getDiceLogs() {
        return diceRollLogRepository.findAll();
    }
}
