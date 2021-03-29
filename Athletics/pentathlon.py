from . import Athletics, KindOfSport 

class Pentathlon(Athletics):
  def __init__(self, number_of_players: int = 0, durathion_of_competitins: int = 0, athletic_equipment: str = '',  jumping_style: str = '' ) -> None:
    super().__init__(KindOfSport.All_around, number_of_players, durathion_of_competitins, athletic_equipment)
    self.__jumping_style = jumping_style
