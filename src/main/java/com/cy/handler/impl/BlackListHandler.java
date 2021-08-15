package com.cy.handler.impl;

import com.cy.handler.GatewayHandler;
import org.springframework.stereotype.Component;

/**
 * Description:ChainMykt
 * Author: chengyu
 * Created: 2021-08-15 17:10
 */
@Component
public class BlackListHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第二关 >>> 黑名单拦截...");
        this.nextService();
    }
}
