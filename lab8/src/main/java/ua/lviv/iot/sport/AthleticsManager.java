package ua.lviv.iot.sport;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import ua.lviv.iot.sport.SortOrder;
import ua.lviv.iot.sport.KindOfSport;
import ua.lviv.iot.sport.Athletics;

@AllArgsConstructor
@Data
public class AthleticsManager {
    private List<Athletics> athletics;

    public List<Athletics> findByKind(final KindOfSport kindType){
        return athletics.stream().filter(item -> item.getKindOfSportType() == kindType).collect(Collectors.toList());
    }
    
    public List<Athletics> sortByNumberOfPlayers(final SortOrder sortOrder){
        List<Athletics> sortAthletics = new ArrayList<>(athletics);
        if (sortOrder == SortOrder.ASC) {
            sortAthletics.sort((athletics1, athletics2) ->
            athletics1.getPlayers().compareTo(athletics2.getPlayers()));
        } else{
            sortAthletics.sort((athletics1, athletics2) ->
            athletics2.getPlayers().compareTo(athletics1.getPlayers()));
                    
        }
        return sortAthletics;
    }
    public List<Athletics> sortByDurationOfCompetitions(final SortOrder sortOrder){
        List<Athletics> sortAthletics = new ArrayList<>(athletics);
        if (sortOrder == SortOrder.ASC) {
            sortAthletics.sort((athletics1, athletics2) ->
                    athletics1.getDuration().compareTo(athletics2.getDuration()));
        } else{
            sortAthletics.sort((athletics1, athletics2) ->
                    athletics2.getDuration().compareTo(athletics1.getDuration()));
                    
        }
        return sortAthletics;
    }
    public static void printAthletics(final List<Athletics> athletics) {
        athletics.forEach(System.out::println);
    }



}
