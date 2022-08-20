package edu.it;

import edu.it.actors.Actor1;
import edu.it.actors.Alarma;
import edu.it.actors.Aldo;
import edu.it.actors.Broker;
import edu.it.actors.Impares;
import edu.it.actors.MemoryBroker;
import edu.it.actors.Mensaje;
import edu.it.actors.Pares;
import edu.it.actors.Suscriptor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        Broker broker = new MemoryBroker();
        
        broker.suscribe(new Suscriptor("edu.it.aldo", new Aldo()));
        broker.suscribe(new Suscriptor("edu.it.actor1", new Actor1()));
        broker.suscribe(new Suscriptor("edu.it.pares", new Pares()));
        broker.suscribe(new Suscriptor("edu.it.impares", new Impares()));
        broker.suscribe(new Suscriptor("edu.it.alarma", new Alarma()));
        
        broker.enviarMensaje(new Mensaje("edu.it.actor1", "1"));
    }
}
