package fr.app.adrien.dice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Entity
@Data
@AllArgsConstructor
public class DiceRollLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int diceCount;

    @ElementCollection
    @CollectionTable(name = "dice_roll_results", joinColumns = @JoinColumn(name = "log_id"))
    @Column(name = "result")
    private List<Integer> results;

    private LocalDateTime timestamp;

    public DiceRollLog() {
    }

    @Override
    public String toString() {
        return "DiceRollLog{" +
                "id=" + id +
                ", diceCount=" + diceCount +
                ", results=" + results +
                ", timestamp=" + timestamp +
                '}';
    }
}

