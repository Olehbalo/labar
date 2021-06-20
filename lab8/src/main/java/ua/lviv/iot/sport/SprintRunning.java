package ua.lviv.iot.sport;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SprintRunning extends Athletics {
public SprintRunning(final int id,
                     final KindOfSport kindOfSport,
                     final String athleticEquipment,
                     final String jumpingStyle,
                     final int numberOfPlayers,
                     final int distance,
                     final int durationOfCompetition,
                     final int averageRaceTime) {
    super(id, kindOfSport, athleticEquipment, jumpingStyle, numberOfPlayers,
            distance, durationOfCompetition, averageRaceTime);
    }



}

