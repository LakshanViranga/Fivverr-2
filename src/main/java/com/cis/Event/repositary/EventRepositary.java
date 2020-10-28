package com.cis.Event.repositary;


import com.cis.Event.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepositary extends CrudRepository<Event,String> {

   List<Event> findAll();
}
