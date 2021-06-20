package ua.lviv.iot.sport;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
public class AthleticsManager {
    private List<Athletics> athletics;
    public List<Athletics> findByKind(final KindOfSport kindType) {
        return athletics.stream().filter(item ->
            item.getKindOfSport() == kindType
        ).collect(Collectors.toList());
    }
    public List<Athletics> sortByNumberOfPlayers(final SortOrder sortOrder) {
        List<Athletics> sortAthletics = new ArrayList<>(athletics);
        if (sortOrder == SortOrder.ASC) {
            sortAthletics.sort((athletics1, athletics2) ->
                    athletics1.getNumberOfPlayers(
                    ) - athletics2.getNumberOfPlayers());
        } else {
            sortAthletics.sort((athletics1, athletics2) ->
            athletics2.getNumberOfPlayers() - athletics1.getNumberOfPlayers());
        }
        return sortAthletics;
    }
    public List<Athletics> sortByDurationOfCompetitions(
            final SortOrder sortOrder) {
        List<Athletics> sortAthletics = new ArrayList<>(athletics);
        if (sortOrder == SortOrder.ASC) {
            sortAthletics.sort((athletics1, athletics2) ->
                    athletics1.getDurationOfCompetition(
                    ) - athletics2.getDurationOfCompetition());
        } else {
            sortAthletics.sort((athletics1, athletics2) ->
                    athletics2.getDurationOfCompetition(
                    ) - athletics1.getDurationOfCompetition());
        }
        return sortAthletics;
    }
    public static void printAthletics(final List<Athletics> athletics) {
        athletics.forEach(System.out::println);
    }



}
