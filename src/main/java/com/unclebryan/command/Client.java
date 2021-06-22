package com.unclebryan.command;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/11 11:04
 */
public class Client {
    public static void main(String[] args) {
        //创建调用者遥控器
        RemoteController remoteController = new RemoteController();
        //创建被调用者-电灯
        LightReceiver lightReceiver = new LightReceiver();
        //创建被调用者-电视
        TvReceiver tvReceiver = new TvReceiver();
        //设置命令
        //电灯命令
        remoteController.setCommand(0,new LightOnCommand(lightReceiver),new LightOffCommand(lightReceiver));
        //电视命令
        remoteController.setCommand(1,new TvOnCommand(tvReceiver),new TvOffCommand(tvReceiver));
        //执行动作
        remoteController.onButtonPushed(0);
        remoteController.offButtonPushed(0);
        remoteController.undoButtonPushed();

        remoteController.onButtonPushed(1);
        remoteController.offButtonPushed(1);
        remoteController.undoButtonPushed();
    }
}
