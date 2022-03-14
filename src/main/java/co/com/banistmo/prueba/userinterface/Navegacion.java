package co.com.banistmo.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Navegacion {
    public static final Target PRODUCTOS_SERVICIOS = Target.the("Este boton nos muestra todos los productos y servicios ofrecidos en Banistmo")
            .located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"));
    public static final Target PRESTAMOS = Target.the("Este boton nos muestra a los prestamos que podemos acceder")
            .located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a"));
    public static final Target PRESTAMO_AUTO = Target.the("Este boton nos muestra los beneficios de los creditos para autos")
            .located(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[3]/div/div[1]"));
    public static final Target TASAS_TARIFAS = Target.the("Este boton nos muestra las Tasas y tarifas de los creditos en PDF")
            .located(By.xpath("//*[@id=\"filialTabs\"]/li[4]/a"));
    public static final Target DESCARGAR_PDF = Target.the("Este boton se descargara el PDF")
            .located(By.xpath("//*[@id=\"tab4\"]/table/tbody/tr[2]/td[2]/span/a/img"));
}
