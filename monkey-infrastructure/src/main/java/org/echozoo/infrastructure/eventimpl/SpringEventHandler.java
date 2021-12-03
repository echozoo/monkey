package org.echozoo.infrastructure.eventimpl;

import org.echozoo.domain.event.EventBusHandler;
import org.echozoo.infrastructure.eventimpl.bean.SpringDomainEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author dujf
 * @version 1.0
 * @date 2021/11/23 0:35
 */
@Component
public class SpringEventHandler implements EventBusHandler {

    @Autowired
    private ApplicationContext context;

    @Override
    public Boolean publish(Object event) {
        context.publishEvent(new SpringDomainEvent(this, event));
        return true;
    }
}
