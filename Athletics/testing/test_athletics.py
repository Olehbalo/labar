import unittest

from .. import Athletics, KindOfSport, SportWalking, SprintRunning, Pentathlon


class AthleticsTest(unittest.TestCase):
    def test_athletics(self):
        athletics = Athletics(KindOfSport.All_around, 80, 24, "sportic suit", "scisors", 0, 0)

        self.assertEqual(athletics._kind_of_sport, KindOfSport.All_around)
        self.assertEqual(athletics._number_of_players, 80)
        self.assertEqual(athletics._duration_of_competitions, 24)
        self.assertEqual(athletics._athletic_equipment, "sportic suit")
        self.assertEqual(athletics._jumping_style, "scisors")
        self.assertEqual(athletics._distance, 0)
        self.assertEqual(athletics._average_race_time, 0)
        
        str_must_have = [str(athletics._kind_of_sport.name), str(athletics._number_of_players), str(athletics._duration_of_competitions), str(athletics._athletic_equipment), str(athletics._jumping_style), str(athletics._distance), str(athletics._average_race_time)]
        self.assertEqual(all(map(str(athletics).__contains__, str_must_have)), True)

    def test_pentathlon(self):
        pentathlon = Pentathlon(13, 4, "Mattress", "scissor")

        self.assertEqual(pentathlon._number_of_players, 13)
        self.assertEqual(pentathlon._duration_of_competitions, 4)
        self.assertEqual(pentathlon._athletic_equipment, "Mattress")
        self.assertEqual(pentathlon._jumping_style, "scissor")
        

    def test_sport_walking(self):
        sport_wolking = SportWalking(41, 6, "legs")

        self.assertEqual(sport_wolking._number_of_players, 41)
        self.assertEqual(sport_wolking._duration_of_competitions, 4)
        self.assertEqual(sport_wolking._athletic_equipment, "legs")
    
        
 


    def test_sprint_running(self):
        sprint_running = SprintRunning(22, 2, "sneakers")

        self.assertEqual(sprint_running._number_of_players, 22)
        self.assertEqual(sprint_running._duration_of_competitions, 2)
        self.assertEqual(sprint_running._athletic_equipment, "sneakers")
        

        

