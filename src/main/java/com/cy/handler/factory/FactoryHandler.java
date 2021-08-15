package com.cy.handler.factory;

import com.cy.handler.GatewayHandler;
import com.cy.handler.impl.BlackListHandler;
import com.cy.handler.impl.ConversationHandler;
import com.cy.handler.impl.CurrentLimitHandler;

/**
 * Description:ChainMykt
 * Author: chengyu
 * Created: 2021-08-15 17:35
 */
public class FactoryHandler {

    public static GatewayHandler getFirstGatewayHandler(){
        //1.第一关
        CurrentLimitHandler currentLimitHandler = new CurrentLimitHandler();

        //2.第二关
        BlackListHandler blackListHandler = new BlackListHandler();
        currentLimitHandler.setNextGatewayHandler(blackListHandler);

        //3.第三关
        ConversationHandler conversationHandler = new ConversationHandler();
        blackListHandler.setNextGatewayHandler(conversationHandler);

        return currentLimitHandler;
    }
}
