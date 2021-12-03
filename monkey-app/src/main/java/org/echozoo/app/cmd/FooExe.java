package org.echozoo.app.cmd;

import org.echozoo.domain.gateway.FooRepository;
import org.echozoo.domain.entity.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * cmd
 *
 * @author dujf
 * @version 1.0
 * @date 2021/12/1 10:14
 */
@Component
public class FooExe {

    @Autowired
    private FooRepository fooRepository;

    public Boolean create(Foo foo) {
        return fooRepository.create(foo);
    }
}
