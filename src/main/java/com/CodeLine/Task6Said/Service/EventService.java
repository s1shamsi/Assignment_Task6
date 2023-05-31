package com.CodeLine.Task6Said.Service;

import com.CodeLine.Task6Said.Model.Event;
import com.CodeLine.Task6Said.Repositry.EventRepository;
import com.CodeLine.Task6Said.ResponceObject.GetEventsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepositry;

    public void saveevents(Event events) {
        eventRepositry.save(events);
    }

    public List<Event> getevents() {

        return eventRepositry.findAll();
    }

    public List<Event> getByeventsname(String EventName) {
        Event exampleevent = new Event();
        exampleevent.setEventName(EventName);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Event> example = Example.of(exampleevent, matcher);
        return eventRepositry.findAll(example);

    }

    public GetEventsResponse getEventsAsString(Event events) {
        GetEventsResponse EventsResponse = new GetEventsResponse(events.getEventName(), events.getSport(),
                events.getResults());
        ;

        return EventsResponse;

    }
    public List<Event> searchEvents(String eventName, String sport) {
        Event exampleEvent = new Event();
        if (eventName != null) {
            exampleEvent.setEventName(eventName);
        }
        if (sport != null) {
            exampleEvent.setSport(sport);
        }

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Event> example = Example.of(exampleEvent, matcher);
        return eventRepositry.findAll(example);
    }
}