package org.echozoo.client.service;

import org.echozoo.client.dto.FooDTO;
import org.echozoo.client.vo.FooVO;

/**
 * @author dujf
 */
public interface FooService {

    Boolean create(FooDTO dto);
}
