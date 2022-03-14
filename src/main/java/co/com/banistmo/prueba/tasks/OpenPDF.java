package co.com.banistmo.prueba.tasks;

import co.com.banistmo.prueba.question.LeerPDF;
import co.com.banistmo.prueba.userinterface.Banistmopages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPDF implements Task {

    private LeerPDF leerPDF;
    public static OpenPDF leerpdf() {
        return Tasks.instrumented(OpenPDF.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(leerPDF));
    }
}
