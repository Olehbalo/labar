import unittest

from .. import AthleticsManeger, KindOfSport, SportWalking, SprintRunning, Pentathlon


athletics = [
    SprintRunning(10, 8, "running suit", 7.2),
    SportWalking(30, 5, "sneakers for sports walking", 10),
    Pentathlon(50, 3, "mattress", "scissors"),
    Pentathlon(40, 4, "athletic form", "flip "),
    SprintRunning(20, 7, "sneakers for sports walking", 6.5),
    SportWalking(25, 9, "walking pants", 12)


]

class SortTest(unittest.TestCase):
    def test_sort_by_number_of_players(self):
       mngr = AthleticsManeger()
       mngr.add_athletics(athletics)

       self.assertListEqual(mngr.sort_by_number_of_players(), sorted(athletics, key=lambda s: s.number_of_players))
       self.assertListEqual(mngr.sort_by_number_of_players(True), sorted(athletics, key=lambda s: s.number_of_players, reverse=True))
    
    def test_sort_by_duration_of_competitions(self):
        mngr = AthleticsManeger()
        mngr.add_athletics(athletics)

        self.assertListEqual(mngr.sort_by_duration_of_competitions(), sorted(athletics, key=lambda s: s.duration_of_competitions.lower()))
        self.assertListEqual(mngr.sort_by_duration_of_competitions(True), sorted(athletics, key=lambda s: s.duration_of_competitions.lower(), reverse=True))
        sorted(athletics, key=lambda s: s.duration_of_competitions.lower(), reverse=True)


