package com.kjunias.LingalaFacileServer.core.repository;

import com.kjunias.LingalaFacileServer.core.domain.Order;
import com.kjunias.LingalaFacileServer.core.events.CreateEvent;
import com.kjunias.LingalaFacileServer.core.events.DeleteEvent;
import com.kjunias.LingalaFacileServer.core.events.RequestReadEvent;
import com.kjunias.LingalaFacileServer.core.events.UpdatedEvent;
import com.kjunias.LingalaFacileServer.core.events.orders.*;

import java.util.List;
import java.util.UUID;

//TODO, make this event based again, with persistence integration events.
public interface OrdersRepository {

  Order save(Order order);

  void delete(UUID key);

  Order findById(UUID key);

  List<Order> findAll();
}
