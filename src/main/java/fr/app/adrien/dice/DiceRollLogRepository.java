package fr.app.adrien.dice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceRollLogRepository extends JpaRepository<DiceRollLog, Long> {

    // Ajoutez des méthodes personnalisées si nécessaire, par exemple :
    // List<DiceRollLog> findByDiceCount(int diceCount);

}

