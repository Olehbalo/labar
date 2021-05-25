package ua.lviv.iot.sport;

import lombok.*;


@Data
@EqualsAndHashCode()
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Athletics {
    private static int nextId;

    private int id;
    private KindOfSport kindOfSport;
    private String athleticEquipment;
    private String jumpingStyle;
    private int numberOfPlayers;
    private int  distance;
    private int durationOfCompetition;
    private int averageRaceTime;


}
