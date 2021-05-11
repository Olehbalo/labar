package ua.lviv.iot.sport.athletics;


public class Athletics {
    public String kind_of_sport;
    public String athletic_equipment;
    public String jumping_style;
    public int number_of_players ;
    public int durathion_of_competitins;
    public int  distance;
    public c;

    public Athletics(String kind_0f_sport, String athletic_equipment, String jumping_style, 
                    int number_of_players, int durathion_of_competitins, int  distance, int  distance);
    @Override
    public String toString() {
        return "Athletics{" +
                "kind_of_spor='" + kind_of_sport + '\'' +
                ", athletic_equipment=" + athletic_equipment +
                ", jumping_style=" + jumping_style +
                ", number_of_players=" + number_of_players +
                ", distance=" + distance +
                ", average_race_time=" + average_race_time +
                '}';


    }
}
