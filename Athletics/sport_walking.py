from . import Athletics, KindOfSport 

class SportWalking(Athletics):
  def __init__(self, number_of_players: int = 0, durathion_of_competitins: int = 0, athletic_equipment: str = '',distance: int = 0 ) -> None:
    super().__init__(KindOfSport.Sport_with_finish_line, number_of_players, durathion_of_competitins, athletic_equipment)
    self.__distance = distance