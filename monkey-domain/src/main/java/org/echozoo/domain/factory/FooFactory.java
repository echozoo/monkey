package org.echozoo.domain.factory;

import org.echozoo.domain.entity.Foo;
import org.springframework.stereotype.Component;

/**
 * 领域对象创建工厂
 *
 * @author dujf
 * @version 1.0
 * @date 2021/12/1 19:13
 */

@Component
public class FooFactory {

    public Foo creatFoo() {
        return Foo.builder().build();
    }
}
