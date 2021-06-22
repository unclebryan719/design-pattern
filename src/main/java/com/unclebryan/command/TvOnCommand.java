package com.unclebryan.command;

/**
 * @program: design-pattern
 * @description: 电视打开命令
 * @author: UncleBryan
 * @created: 2021/06/11 11:09
 */
public class TvOnCommand implements Command{
    /**
     * 聚合被调用者
     */
    private TvReceiver tvReceiver;

    /**
     * 构造注入
     * @param tvReceiver
     */
    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void excute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
