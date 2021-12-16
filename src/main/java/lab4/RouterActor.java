package lab4;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.routing.Routee;

import java.util.ArrayList;
import java.util.List;

public class RouterActor extends AbstractActor {

    private final int CONST = 10;
    private final ActorRef storingResultActor;

    public RouterActor() {
        storingResultActor = getContext().actorOf(Props.create(StoringResultActor.class));

        List<Routee> routees = new ArrayList<>();
        for (int i = 0; i < CONST; i++) {
            ActorRef performingResultActor = getContext();
        }

    }
}