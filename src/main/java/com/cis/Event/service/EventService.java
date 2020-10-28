package com.cis.Event.service;

import com.cis.Event.model.Event;
import com.cis.Event.repositary.EventRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

List<Event> events = null;

@Autowired
EventRepositary eventRepositary;

public List<Event> getAllEvent(){
    return eventRepositary.findAll();
}
}
