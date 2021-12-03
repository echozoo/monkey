package org.echozoo.domain.event;

/**
 * @author dujf
 * @version 1.0
 * @date 2021/11/22 22:12
 */

public interface EventBusHandler {

    Boolean publish(Object event);
}
