package com.CodeLine.Task6Said.Controller;

import com.CodeLine.Task6Said.Model.Event;
import com.CodeLine.Task6Said.Repositry.EventRepository;
import com.CodeLine.Task6Said.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
public class EventController {

    @Autowired
    EventService eventsService;
    @RequestMapping("events/create")
    public void saveevents() {
        createevents();
    }

    private void createevents() {
        Event events = new Event();
        events.setEventName("olympic");
        events.setSchedule(new Date());
        events.setResults("win");
        events.setSport("run");
        eventsService.saveevents(events);
    }
    @RequestMapping ("events/get")
    public List<Event> getEvents(){
        return eventsService.getevents();
    }

    @RequestMapping(value = "events/get/{events}", method = RequestMethod.GET)
    public List<Event> getEvents(@RequestParam(value = "events", required = false) String events ) {
        if (events != null) {

            return eventsService.getByeventsname(events);
        } else {

            return eventsService.getevents();
        }
    }

    @RequestMapping(value = "events/search", method = RequestMethod.GET)
    public List<Event> searchEvents(
            @RequestParam(value = "eventName", required = false) String eventName,
            @RequestParam(value = "sport", required = false) String sport) {

        return eventsService.searchEvents(eventName, sport);
    }

}