package com.cy.handler.controller;

import com.cy.handler.GatewayHandler;
import com.cy.handler.factory.FactoryHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:ChainMykt
 * Author: chengyu
 * Created: 2021-08-15 17:54
 */
@RestController
public class HandlerController {

    @RequestMapping("/clientHandler")
    public String handlerTest(){
        GatewayHandler firstGatewayHandler = FactoryHandler.getFirstGatewayHandler();
        firstGatewayHandler.service();
        return "success";
    }
}
