package com.unclebryan.command;

/**
 * 命令接口
 */
public interface Command {
    //执行
    void excute();

    //撤销
    void undo();
}
