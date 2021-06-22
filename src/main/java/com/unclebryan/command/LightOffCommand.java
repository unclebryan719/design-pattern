package com.unclebryan.command;

/**
 * @program: design-pattern
 * @description: 电灯关的命令
 * @author: UncleBryan
 * @created: 2021/06/11 10:44
 */
public class LightOffCommand implements Command{
    /**
     * 聚合Receiver
     */
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
