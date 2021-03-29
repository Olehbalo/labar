from . import Athletics, KindOfSport 

class SprintRunning(Athletics):
  def __init__(self, number_of_players: int = 0, durathion_of_competitins: int = 0, athletic_equipment: str = '', average_race_time: float = 0 ) -> None:
    super().__init__(KindOfSport.Sport_with_finish_line, number_of_players, durathion_of_competitins, athletic_equipment)
    self.__average_race_time = average_race_time

 