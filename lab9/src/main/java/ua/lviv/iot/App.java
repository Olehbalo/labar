package ua.lviv.iot;

import ua.lviv.iot.sport.Athletics;
import ua.lviv.iot.sport.KindOfSport;
import ua.lviv.iot.sport.AthleticsManager;
import ua.lviv.iot.sport.SortOrder;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(final String[]args) {
        List<Athletics> listOfAthletics = new ArrayList<>();
        listOfAthletics.add(new ua.lviv.iot.sport.Phentathlon(0,
                KindOfSport.AllAround, "sport suit", "fly",
                2, 100, 2, 5));

        listOfAthletics.add(new ua.lviv.iot.sport.SportWalking(
                1, KindOfSport.SportWithFinishLine, "sneakers", "nothing",
                50, 1000, 12, 15));

        listOfAthletics.add(new ua.lviv.iot.sport.SprintRunning(2,
                KindOfSport.SportWithFinishLine, "shorts", "nothing",
                10, 6000, 13, 10));
        AthleticsManager athleticsManager = new AthleticsManager(listOfAthletics);

        System.out.print("find by kind:" + "\n" + "\n");
        AthleticsManager.printAthletics(
                athleticsManager.findByKind(KindOfSport.AllAround));
        System.out.print("\n");

        System.out.print("sortByNumberOfPlayers:" + "\n" + "\n");
        AthleticsManager.printAthletics(
                athleticsManager.sortByNumberOfPlayers(SortOrder.ASC));
        System.out.print("\n");

        System.out.print("sortByDurationOfCompetitions:" + "\n" + "\n");
        AthleticsManager.printAthletics(
                athleticsManager.sortByDurationOfCompetitions(SortOrder.DESC));

    }

}

