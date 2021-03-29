from enum import Enum


class KindOfSport(Enum):

 All_around = 0

 Sport_with_finish_line = 1


class Athletics:
    def __init__(self, kind_of_sport: KindOfSport, number_of_players: int = 0, durathion_of_competitins: int = 0, athletic_equipment: str = '', jumping_style: str = '',  distance: int = 0, average_race_time: float = 0) -> None:
        self._kind_of_sport = KindOfSport(kind_of_sport) 
        self._number_of_players = number_of_players
        self._duration_of_competitions = durathion_of_competitins
        self._athletic_equipment = athletic_equipment
        self._jumping_style = jumping_style
        self._distance = distance
        self._average_race_time = average_race_time
        
    def __str__(self):
        return f"kind: {self._kind_of_sport}\nnumber of players: {self._number_of_players}\ndurations of competitions: {self._duration_of_competitions}\n" \
               f"athletic equipment: {self._athletic_equipment}\njumping style: {self._jumping_style}\ndistance: {self._distance}\naverage race time: {self._average_race_time}\n"
