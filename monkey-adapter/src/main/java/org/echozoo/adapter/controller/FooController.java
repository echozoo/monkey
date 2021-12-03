package org.echozoo.adapter.controller;

import org.echozoo.client.dto.FooDTO;
import org.echozoo.client.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo
 *
 * @author dujf
 * @version 1.0
 * @date 2021/12/1 9:57
 */
@RestController
@RequestMapping("/api/foo")
public class FooController {

    @Autowired
    private FooService fooService;

    @PostMapping("/v1/create")
    public Boolean create(FooDTO dto) {
        return fooService.create(dto);
    }
}
