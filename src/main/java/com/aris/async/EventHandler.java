package com.aris.async;

import java.util.List;

/**
 * Created by aris on 2018/7/30.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
