package ua.lviv.iot.sport.service;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.sport.Athletics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;



@Service
@ApplicationScope
public class AthleticsService {

    private AtomicInteger id = new AtomicInteger(0);
    private Map<Integer, Athletics> athleticsMap = new HashMap<Integer, Athletics>();

    public Athletics addAthletics(Athletics athletics) {
        Integer athleticsId = id.incrementAndGet();
        athletics.setId(athleticsId);
        athleticsMap.put(athleticsId, athletics);
        return athletics;
    }

    public Athletics updateAthletics(Athletics athletics) {
        return athleticsMap.put(athletics.getId(), athletics);
    }

    public List<Athletics> getAthletics(){
        return athleticsMap.values().stream().collect(Collectors.toList());
    }

    public Athletics getAthletics(Integer id) {
        return athleticsMap.get(id);
    }
    public Athletics deleteAthletics(Integer id) {
        Athletics athletics = athleticsMap.get(id);
        athleticsMap.remove(id);
        return athletics;
    }
}

