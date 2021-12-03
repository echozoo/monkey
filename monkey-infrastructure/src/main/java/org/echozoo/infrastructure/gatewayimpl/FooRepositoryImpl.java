package org.echozoo.infrastructure.gatewayimpl;

import org.echozoo.domain.gateway.FooRepository;
import org.echozoo.domain.entity.Foo;
import org.springframework.stereotype.Service;

/**
 * 仓促实现
 *
 * @author dujf
 * @version 1.0
 * @date 2021/12/1 10:54
 */
@Service
public class FooRepositoryImpl implements FooRepository {

    @Override
    public Boolean create(Foo foo) {
        return true;
    }
}
