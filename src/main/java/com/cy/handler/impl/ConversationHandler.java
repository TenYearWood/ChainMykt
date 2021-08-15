package com.cy.handler.impl;

import com.cy.handler.GatewayHandler;

/**
 * Description:ChainMykt
 * Author: chengyu
 * Created: 2021-08-15 17:10
 */
public class ConversationHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第三关 >>> 用户会话拦截...");
        this.nextService();
    }
}
