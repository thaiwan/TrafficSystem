package com.thaiwan.web;

import com.thaiwan.domain.Station;
import com.thaiwan.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class StationController {

    @Autowired
    private StationService stationService;

    @RequestMapping("/index")
    public String allStation(Map<String, Object> map){

        map.put("station", new Station());
        map.put("allStations", stationService.allStations());

        return "station";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addRoute(@ModelAttribute("station") Station station,
                           BindingResult result) {

        stationService.addStation(station);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{stationId}")
    public String deleteStation(@PathVariable("stationId") Integer stationId) {

        stationService.deleteStation(stationId);

        return "redirect:/index";
    }
}
