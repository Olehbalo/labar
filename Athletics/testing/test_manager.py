import unittest

from .. import AthleticsManeger, KindOfSport, SportWalking, SprintRunning, Pentathlon

class ManagerTest(unittest.TestCase):
     def test_add_athletics(self):
        athletics = [
            SprintRunning(10, 8, "running suit", 7.2),
            SportWalking(30, 5, "sneakers for sports walking", 10)
        ]

        mngr = AthleticsManeger()

        mngr.add_athletics(athletics[0])
        self.assertListEqual(mngr.athletics, [athletics[0]])

        mngr.add_athletics(athletics[1])
        self.assertListEqual(mngr.athletics, athletics)


     def test_add_athletic(self):
        athletics = [
             SprintRunning(10, 8, "running suit", 7.2),
             SportWalking(30, 5, "sneakers for sports walking", 10),
             Pentathlon(50, 3, "mattress", "scissors"),
             Pentathlon(40, 4, "athletic form", "flip "),
             SprintRunning(20, 7, "sneakers for sports walking", 6.5),
             SportWalking(25, 9, "walking pants", 12)
        ]    
        
        mngr = AthleticsManeger()
        mngr.add_athletics(athletics)

        self.assertListEqual(mngr.athletics, athletics)        