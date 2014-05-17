package com.kjunias.core.LingalaFacileServer.core.events.orders;

import com.kjunias.core.LingalaFacileServer.core.events.RequestReadEvent;

import java.util.UUID;

public class RequestOrderDetailsEvent extends RequestReadEvent {
  private UUID key;

  public RequestOrderDetailsEvent(UUID key) {
    this.key = key;
  }

  public UUID getKey() {
    return key;
  }
}
