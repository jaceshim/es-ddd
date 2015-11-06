package nl.marcenschede.tests.cqrs2.invoice;

import nl.marcenschede.tests.cqrs2.base.Event;

import java.util.UUID;

/**
 * Created by marc on 27/10/15.
 */
public class InvoiceSetNameEvent extends Event {
    private  UUID uuid;
    private  String naam;

    private InvoiceSetNameEvent() {
    }

    public InvoiceSetNameEvent(UUID uuid, String naam) {
        this.uuid = uuid;
        this.naam = naam;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNaam() {
        return naam;
    }
}
