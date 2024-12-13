package fr.app.adrien.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class DiceRollLogService {

    @Autowired
    private DiceRollLogRepository diceRollLogRepository;

    private final Random random = new Random();

    /**
     * Lance un nombre de dés donné, retourne les résultats et enregistre l'historique.
     *
     * @param diceCount Nombre de dés à lancer.
     * @return Objet DiceRollLog contenant les informations des résultats et horodatage.
     */
    public List<Integer> rollDice(int diceCount) {
        if (diceCount <= 0) {
            throw new IllegalArgumentException("Le nombre de dés doit être supérieur à 0.");
        }

        // Génération des résultats
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < diceCount; i++) {
            results.add(random.nextInt(6) + 1);
        }

        // Création de l'objet DiceRollLog
        DiceRollLog log = new DiceRollLog();
        log.setDiceCount(diceCount);
        log.setResults(results);
        log.setTimestamp(LocalDateTime.now());

        diceRollLogRepository.save(log);

        return results;
    }
}