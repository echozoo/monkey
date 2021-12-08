package org.echozoo.domain.gateway;

import org.echozoo.domain.entity.Foo;

/**
 * 数据仓促
 *
 * @author dujf
 */
public interface FooRepository {

    Boolean create(Foo foo);
}
