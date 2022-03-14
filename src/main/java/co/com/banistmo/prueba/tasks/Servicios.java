package co.com.banistmo.prueba.tasks;

import co.com.banistmo.prueba.userinterface.Navegacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Servicios implements Task {
    private Navegacion navegacion;
    public static Servicios click() {
        return Tasks.instrumented(Servicios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Navegacion.PRODUCTOS_SERVICIOS),
                Click.on(Navegacion.PRESTAMOS),
                Click.on(Navegacion.PRESTAMO_AUTO),
                Click.on(Navegacion.TASAS_TARIFAS),
                Click.on(Navegacion.DESCARGAR_PDF)


        );

    }
}
