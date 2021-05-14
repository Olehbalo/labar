package ua.lviv.iot.sport;

import lombok.Data;
import lombok.EqualsAndHashCode;

 @EqualsAndHashCode(callSuper = true)
 @Data


public class Phentathlon extends Athletics{
    public Phentathlon(String kind_of_sport, String athletic_equipment, String jumping_style,int number_of_players, int distance,
                       int durathion_of_competitins, int average_race_time){
        super(kind_of_sport, athletic_equipment, jumping_style, number_of_players, distance, durathion_of_competitins, average_race_time );
    }
@Override
public String toString() {
    return "Athletics{" +
        "kind_of_sport=" + kind_of_sport + 
        ", athletic_equipment='" + athletic_equipment +  '\'' +
        ", jumping_style=" + jumping_style +
        ", number_of_players=" + number_of_players +
            '}';
}

}
