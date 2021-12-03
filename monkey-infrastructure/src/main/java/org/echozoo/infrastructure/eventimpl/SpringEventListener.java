package org.echozoo.infrastructure.eventimpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.echozoo.infrastructure.eventimpl.bean.SpringDomainEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author dujf
 * @version 1.0
 * @date 2021/11/23 0:35
 */
@Slf4j
@Component
public class SpringEventListener {

    @EventListener
    public Boolean listenApplicationEvent(SpringDomainEvent event) {
        try {
            final String s = new ObjectMapper().writeValueAsString(event);
            log.info("收到事件通知：{}", s);
        } catch (JsonProcessingException e) {
            log.info("通知事件序列化异常：{}", e.getLocalizedMessage(), e);
        }
        return true;
    }
}
