package ua.lviv.iot.sport;

import lombok.Data;
import lombok.EqualsAndHashCode;

 @EqualsAndHashCode(callSuper = true)
 @Data


public class SportWalking extends Athletics{
    public SportWalking(int number_of_players, int durathion_of_competitins, String athletic_equipment, int distance){
        super(number_of_players, durathion_of_competitins, athletic_equipment);
    }
@Override
public String toString() {
    return "Athletics{" +
        "kind_of_sport=" + kind_of_sport + 
        ", athletic_equipment='" + athletic_equipment +  '\'' +
        ", durathion_of_competitins=" + durathion_of_competitins +
        ", number_of_players=" + number_of_players +
        ", distance=" + distance +
        '}';
}


}
