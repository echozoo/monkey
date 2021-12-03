package org.echozoo.infrastructure.eventimpl.bean;


import org.springframework.context.ApplicationEvent;

/**
 * 事件
 *
 * @author dujf
 * @version 1.0
 * @date 2021/11/22 22:44
 */
public class SpringDomainEvent extends ApplicationEvent {

    private Object event;

    public Object getEvent() {
        return event;
    }

    public void setEvent(Object event) {
        this.event = event;
    }

    public SpringDomainEvent(Object source, Object event) {
        super(source);
        this.event = event;
    }
}
