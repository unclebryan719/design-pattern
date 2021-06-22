package com.unclebryan.mediator;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/12 01:01
 */

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);

    }

    @Override
    public void SendMessage(int stateChange) {
    }

    public void StartTv() {
    }

    public void StopTv() {
    }
}