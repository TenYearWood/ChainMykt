package com.cy.handler;

/**
 * 网关处理抽象类
 */
public abstract class GatewayHandler {

    /**
     * 下一个处理的Handler
     */
    protected GatewayHandler nextGatewayHandler;

    /**
     * 使用抽象类定义共同方法的行为
     */
    public abstract void service();

    /**
     * 执行下一个handler
     */
    protected void nextService(){
        if(null != nextGatewayHandler){
            this.nextGatewayHandler.service();
        }
    }

    public void setNextGatewayHandler(GatewayHandler nextGatewayHandler){
        this.nextGatewayHandler = nextGatewayHandler;
    }
}
