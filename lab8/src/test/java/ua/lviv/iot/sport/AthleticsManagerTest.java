package ua.lviv.iot.sport;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class AthleticsManagerTest {
    List<Athletics> listOfAthletics = List.of(new ua.lviv.iot.sport.Phentathlon(0,
            KindOfSport.AllAround, "sport suit", "fly",
            2, 100, 2, 5),
            new ua.lviv.iot.sport.SportWalking(
                    1, KindOfSport.SportWithFinishLine, "sneakers", "nothing",
                    50, 1000, 12, 15),
            new ua.lviv.iot.sport.SprintRunning(2,
                    KindOfSport.SportWithFinishLine, "shorts", "nothing",
                    10, 6000, 13, 10));
    AthleticsManager athleticsManager = new AthleticsManager(listOfAthletics);

    @Test
    void findByKind() {
        List<Athletics> expected = listOfAthletics.stream().filter(item ->
                item.getKindOfSport() == KindOfSport.AllAround
        ).collect(Collectors.toList());
        assertEquals(expected,athleticsManager.findByKind(KindOfSport.AllAround));
    }

    @Test
    void sortByNumberOfPlayers() {
        List<Athletics> sortAthletics = new ArrayList<>(listOfAthletics);
        sortAthletics.sort((athletics1, athletics2) ->
                athletics1.getNumberOfPlayers(
                ) - athletics2.getNumberOfPlayers());
        assertEquals(sortAthletics,athleticsManager.sortByNumberOfPlayers(SortOrder.ASC));
        sortAthletics.sort((athletics1, athletics2) ->
                athletics2.getNumberOfPlayers() - athletics1.getNumberOfPlayers());
        assertEquals(sortAthletics,athleticsManager.sortByNumberOfPlayers(SortOrder.DESC));

    }

    @Test
    void sortByDurationOfCompetitions() {
        List<Athletics> sortAthletics = new ArrayList<>(listOfAthletics);
        sortAthletics.sort((athletics1, athletics2) ->
                athletics1.getDurationOfCompetition(
                ) - athletics2.getDurationOfCompetition());
        assertEquals(sortAthletics,athleticsManager.sortByDurationOfCompetitions(SortOrder.ASC));
        sortAthletics.sort((athletics1, athletics2) ->
                athletics2.getDurationOfCompetition(
                ) - athletics1.getDurationOfCompetition());
        assertEquals(sortAthletics,athleticsManager.sortByDurationOfCompetitions(SortOrder.DESC));

    }
    @Test
    void printAthletics(){
        AthleticsManager.printAthletics(listOfAthletics);
    }

}