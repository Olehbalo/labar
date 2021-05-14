package ua.lviv.iot.sport;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Athletics {
    public String kind_of_sport;
    public String athletic_equipment;
    public String jumping_style;
    public int number_of_players ;
    public int  distance;
    public int durathion_of_competitins;
    public int average_race_time ;
    /*public Athletics(String kind_of_sport, String athletic_equipment, String jumping_style, int number_of_players, int distance,
                     int durathion_of_competitins, int average_race_time){
                        this.kind_of_sport = kind_of_sport;
                        this.athletic_equipment = athletic_equipment;
                        this.jumping_style = jumping_style;
                        this.number_of_players = number_of_players;
                        this.durathion_of_competitins = durathion_of_competitins;
                        this.distance = distance;
                        this.average_race_time = average_race_time;


                    }*/

   @Override
    public java.lang.String toString() {
        return "Athletics{" +
            "kind_of_sport=" + kind_of_sport + 
            ", athletic_equipment='" + athletic_equipment +  '\'' +
            ", jumping_style=" + jumping_style +
            ", number_of_players=" + number_of_players +
            ", distance=" + distance +
            ", average_race_time=" + average_race_time +
            '}';

    }

 }
