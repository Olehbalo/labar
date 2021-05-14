package ua.lviv.iot;

import ua.lviv.iot.sport.Athletics;
import ua.lviv.iot.sport.KindOfSport;
import ua.lviv.iot.sport.AthleticsManager;
import ua.lviv.iot.sport.SortOrder;

import java.util.List;



public class App {
    public static void main(String[]args) {
        List<Athletics> listOfAthletics = List.of(
            new ua.lviv.iot.sport.Phentathlon("AllAround", "sport suit", "fly", 15, 1000, 4, 3 ),

            new ua.lviv.iot.sport.SportWalking(25, 9, "walking pants", 12),
                

            new ua.lviv.iot.sport.SprintRunning( 30 , 5, "sneakers for sports walking", 10));

    
    AthleticsManager AthleticsManager = new AthleticsManager(listOfAthletics);

    System.out.print("find by kind:" + "\n" + "\n");
    AthleticsManager.printAthletics(AthleticsManager.findByKind(KindOfSport.AllAround));
    System.out.print("\n");

    System.out.print("sortByNumberOfPlayers:" + "\n" + "\n");
    AthleticsManager.printAthletics(AthleticsManager.sortByNumberOfPlayers(SortOrder.ASC));
    System.out.print("\n");

    System.out.print("sortByDurationOfCompetitions:" + "\n" + "\n");
    AthleticsManager.printAthletics(AthleticsManager.sortByDurationOfCompetitions(SortOrder.DESC));

    }

}

