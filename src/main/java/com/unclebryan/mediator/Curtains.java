package com.unclebryan.mediator;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/12 01:01
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void SendMessage(int stateChange) {
        // this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}