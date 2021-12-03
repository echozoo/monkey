package org.echozoo.app.builder;

import org.echozoo.client.vo.FooVO;
import org.echozoo.domain.entity.Foo;
import org.springframework.stereotype.Component;

/**
 * @author dujf
 * @version 1.0
 * @date 2021/12/1 19:22
 */
@Component
public class FooBuilder {

    public Boolean buildVo(Foo foo) {
        return true;
    }
}
