package com.unclebryan.command;

/**
 * @program: design-pattern
 * @description: 遥控器
 * @author: UncleBryan
 * @created: 2021/06/11 10:50
 */
public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    /**
     * 初始化
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给按钮设置命令
     * @param num
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int num, Command onCommand, Command offCommand){
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    /**
     * 按下打开按钮，执行命令
     */
    public void onButtonPushed(int num){
        onCommands[num].excute();
        // 记录这次操作用于撤销
        undoCommand = onCommands[num];
    }

    /**
     * 按下关闭按钮，执行命令
     */
    public void offButtonPushed(int num){
        offCommands[num].excute();
        // 记录这次操作用于撤销
        undoCommand = offCommands[num];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonPushed(){
        undoCommand.undo();
    }
}
