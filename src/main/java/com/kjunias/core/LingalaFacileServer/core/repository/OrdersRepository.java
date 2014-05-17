package com.kjunias.core.LingalaFacileServer.core.repository;

import com.kjunias.core.LingalaFacileServer.core.domain.Order;
import com.kjunias.core.LingalaFacileServer.core.events.CreateEvent;
import com.kjunias.core.LingalaFacileServer.core.events.DeleteEvent;
import com.kjunias.core.LingalaFacileServer.core.events.RequestReadEvent;
import com.kjunias.core.LingalaFacileServer.core.events.UpdatedEvent;
import com.kjunias.core.LingalaFacileServer.core.events.orders.*;

import java.util.List;
import java.util.UUID;

//TODO, make this event based again, with persistence integration events.
public interface OrdersRepository {

  Order save(Order order);

  void delete(UUID key);

  Order findById(UUID key);

  List<Order> findAll();
}
