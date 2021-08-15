package com.cy.handler.impl;

import com.cy.handler.GatewayHandler;

/**
 * Description:ChainMykt
 * Author: chengyu
 * Created: 2021-08-15 17:10
 */
public class CurrentLimitHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第一关 >>> api接口的限流...");
        this.nextService();
    }
}
