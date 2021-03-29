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


class FindTest(unittest.TestCase):
    def test_find_by_kind(self) :
        mngr = AthleticsManeger()
        mngr.add_athletics(athletics)

        for kind_of_sport in KindOfSport:
            self.assertListEqual(mngr.find_by_kind(kind_of_sport), [x for x in athletics if x._kind_of_sport == kind_of_sport])

      