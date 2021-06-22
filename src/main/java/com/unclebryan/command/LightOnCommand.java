package com.unclebryan.command;

/**
 * @program: design-pattern
 * @description: 电灯开的命令
 * @author: UncleBryan
 * @created: 2021/06/11 10:44
 */
public class LightOnCommand implements Command{
    /**
     * 聚合Receiver
     */
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
