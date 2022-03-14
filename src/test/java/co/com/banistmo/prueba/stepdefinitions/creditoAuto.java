package co.com.banistmo.prueba.stepdefinitions;

import co.com.banistmo.prueba.tasks.OpenPDF;
import co.com.banistmo.prueba.tasks.OpenUp;
import co.com.banistmo.prueba.tasks.Servicios;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class creditoAuto {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que yo ingreso a la url del sistema banistmo$")
    public void que_yo_ingreso_a_la_url_del_sistema_banistmo() throws Exception {
        OnStage.theActorCalled("Jose").wasAbleTo(OpenUp.thePage());

    }

    @When("^yo hago clic en la opción productos y servicios y luego hago clic en prestamos y luego hago clic en la opcion de pretsamos de auto y luego hago clic en la opcion de tasas y tarifas y hago clic en la opcion del pdf prohibiciones$")
    public void yo_hago_clic_en_la_opción_productos_y_servicios_y_luego_hago_clic_en_prestamos_y_luego_hago_clic_en_la_opcion_de_pretsamos_de_auto_y_luego_hago_clic_en_la_opcion_de_tasas_y_tarifas_y_hago_clic_en_la_opcion_del_pdf_prohibiciones() throws Exception {
        OnStage.theActorCalled("Jose").wasAbleTo(Servicios.click());

    }

    @Then("^debo visualizar que se abra un pdf en otra pestaña y diga prohibiciones @Scenario$")
    public void debo_visualizar_que_se_abra_un_pdf_en_otra_pestaña_y_diga_prohibiciones_Scenario() throws Exception {
        OnStage.theActorCalled("Jose").wasAbleTo(OpenPDF.leerpdf());
    }

}
