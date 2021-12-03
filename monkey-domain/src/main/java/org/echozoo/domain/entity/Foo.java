package org.echozoo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 领域对象
 *
 * @author dujf
 * @version 1.0
 * @date 2021/12/1 10:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Foo {

    private Object event;
}
