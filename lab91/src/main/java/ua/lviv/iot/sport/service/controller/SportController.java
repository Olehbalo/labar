package ua.lviv.iot.sport.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.sport.Athletics;
import ua.lviv.iot.sport.service.AthleticsService;

import java.util.List;

@RestController
@RequestMapping(path = "/athletics")
public class SportController {

    @Autowired
    private AthleticsService athleticsService;

    @GetMapping(path = "/{id}")
    public Athletics getAthletics(@PathVariable(name = "id") Integer id ) {
        return athleticsService.getAthletics(id);
    }

    @GetMapping
    public List<Athletics> getAthletics(){
        return athleticsService.getAthletics();
    }


    @PostMapping
    public Athletics createPosition(@RequestBody Athletics athletics) {
        return athleticsService.addAthletics(athletics);
    }

    @PutMapping
    public Athletics updateAthletics(@RequestBody  Athletics athletics) {
        if (athleticsService.getAthletics(athletics.getId()) != null) {
            return athleticsService.updateAthletics(athletics);
        } else {
            return null;
        }
    }
    @DeleteMapping(path = "/{id}")
    public Athletics deleteAthletics(@PathVariable(name = "id") Integer id ) {
        return athleticsService.deleteAthletics(id);
    }

}
