package org.echozoo.app.serviceimpl;

import org.echozoo.app.builder.FooBuilder;
import org.echozoo.app.cmd.FooExe;
import org.echozoo.client.dto.FooDTO;
import org.echozoo.client.service.FooService;
import org.echozoo.client.vo.FooVO;
import org.echozoo.domain.entity.Foo;
import org.echozoo.domain.event.EventBusHandler;
import org.echozoo.domain.factory.FooFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 服务
 *
 * @author dujf
 * @version 1.0
 * @date 2021/12/1 10:00
 */
@Service
public class FooServiceImpl implements FooService {

    @Autowired
    private FooFactory fooFactory;
    @Autowired
    private FooExe fooExe;
    @Autowired
    private EventBusHandler eventBusHandler;
    @Autowired
    private FooBuilder fooBuilder;

    @Override
    public Boolean create(FooDTO dto) {
        final Foo foo = fooFactory.creatFoo();
        fooExe.create(foo);
        eventBusHandler.publish(foo.getEvent());
        return fooBuilder.buildVo(foo);
    }
}
