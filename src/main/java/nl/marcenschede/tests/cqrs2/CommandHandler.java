package nl.marcenschede.tests.cqrs2;

/**
 * Created by marc on 27/10/15.
 */
public interface CommandHandler {

    public void handle(Command cmd);
}
