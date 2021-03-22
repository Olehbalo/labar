from ..manager.manager import AthleticsManeger
from .. import KindOfSport, SportWalking, SprintRunning, Pentathlon
class AthleticsTest:
  def __init__(self) -> None:
    pass

  def main(self) -> None:
    Athletics = AthleticsManeger()
    Athletics.add_athletics([
        SprintRunning(10, 8, "running suit", 7.2),
        SportWalking(30, 5, "sneakers for sports walking", 10),
        Pentathlon(50, 3, "mattress", "scissors"),
        Pentathlon(40, 4, "athletic form", "flip "),
        SprintRunning(20, 7, "sneakers for sports walking", 6.5),
        SportWalking(25, 9, "walking pants", 12)
        ])
  

    print('Sorted by number of player :\n\n' + '\n'.join([str(x) for x in Athletics.sort_by_number_of_players(True)]), '\n')
    print('Sorted by duration of competitions :\n\n' + '\n'.join([str(x) for x in Athletics.sort_by_duration_of_competitions()]), '\n')
    
    