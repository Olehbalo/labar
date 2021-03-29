from typing import List
from .. import Athletics, KindOfSport


class AthleticsManeger:
     def __init__(self) -> None:
         self.athletics =[]


     def add_sport(self, sport: Athletics) -> None:
       self.athletics.append(sport)

     def add_athletics(self, athletics: List[Athletics]) ->None:
         self.athletics += athletics


     def find_by_kind(self, kind_of_sport: KindOfSport) -> List[Athletics]:
         return [sport for sport in self.athletics if sport.kind == kind_of_sport]



     def sort_by_number_of_players(self, reverse: bool = False, athletics: List[Athletics] = None) -> None:
         return sorted(athletics if athletics else self.athletics, key=lambda s: s._number_of_players, reverse=reverse)


     def sort_by_duration_of_competitions(self, reverse: bool = False, athletics: List[Athletics] = None) -> None:
         return sorted(athletics if athletics else self.athletics, key=lambda s: s._duration_of_competitions, reverse=reverse) 
