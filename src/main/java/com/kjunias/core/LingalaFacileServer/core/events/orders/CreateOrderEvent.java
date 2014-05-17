package com.kjunias.core.LingalaFacileServer.core.events.orders;

import com.kjunias.core.LingalaFacileServer.core.events.CreateEvent;

public class CreateOrderEvent extends CreateEvent {
  private OrderDetails details;

  public CreateOrderEvent(OrderDetails details) {
    this.details = details;
  }

  public OrderDetails getDetails() {
    return details;
  }
}
