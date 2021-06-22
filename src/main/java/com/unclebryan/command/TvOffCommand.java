package com.unclebryan.command;

/**
 * @program: design-pattern
 * @description: 电视关闭命令
 * @author: UncleBryan
 * @created: 2021/06/11 11:09
 */
public class TvOffCommand implements Command{
    /**
     * 聚合被调用者
     */
    private TvReceiver tvReceiver;

    /**
     * 构造注入
     * @param tvReceiver
     */
    public TvOffCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void excute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
