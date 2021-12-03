package org.echozoo.domain.gateway;

import org.echozoo.domain.entity.Foo;

public interface FooRepository {

    Boolean create(Foo foo);
}
