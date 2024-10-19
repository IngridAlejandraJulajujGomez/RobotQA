
package practica.tasks.login;


import practica.interactions.Click;
import practica.interactions.WaitLoader;
import practica.interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static practica.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Login implements Task {
    private String user;
    private String password;
    private String user2;

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_USUARIO).text("alej68omez@gmail.com"),
                WaitUntil.the(BUTTON_CONTINUAR, isClickable()),
                Click.on(BUTTON_CONTINUAR)

        );

        if (password != null) {
            actor.attemptsTo(
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_CONTRASENIA).text(password),
                WaitUntil.the(BUTTON_INICIAR_SESION, isClickable()),
                Click.on(BUTTON_INICIAR_SESION),
                WaitUntil.the(BUTTON_MENU, isClickable()),
                Click.on(BUTTON_MENU),
                WaitUntil.the(BUTTON_PRODUCTO, isClickable()),
                Click.on(BUTTON_PRODUCTO),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_CANTIDAD).text("3"),
                WaitUntil.the(BUTTON_COLOR, isClickable()),
                Click.on(BUTTON_COLOR),
                WaitUntil.the(BUTTON_CESTA, isClickable()),
                Click.on(BUTTON_CESTA),
                WaitUntil.the(BUTTON_PAIS, isClickable()),
                Click.on(BUTTON_PAIS),
                WaitUntil.the(BUTTON_PAISGT, isClickable()),
                Click.on(BUTTON_PAISGT),
                WaitUntil.the(BUTTON_REGION, isClickable()),
                Click.on(BUTTON_REGION),
                WaitUntil.the(BUTTON_REGIONGT, isClickable()),
                Click.on(BUTTON_REGIONGT),
                WaitUntil.the(BUTTON_ANADIR, isClickable()),
                Click.on(BUTTON_ANADIR),
                WaitUntil.the(BUTTON_ENVIO, isClickable()),
                Click.on(BUTTON_ENVIO),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_CORREOC).text("alej68omez@gmail.com"),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_TELEFONOC).text("55935309"),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_NOMBRE).text("Ingrid"),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_APELLIDO).text("Gomez"),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_DIRECCION).text("Sololá"),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_CIUDAD).text("Sololá"),
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_CODIGOPOSTAL).text("07001"),
                WaitUntil.the(BUTTON_PAISC, isClickable()),
                Click.on(BUTTON_PAISC),
                WaitUntil.the(BUTTON_PAISGTC, isClickable()),
                Click.on(BUTTON_PAISGTC),
                WaitUntil.the(BUTTON_REGIONC, isClickable()),
                Click.on(BUTTON_REGIONC),
                WaitUntil.the(BUTTON_REGIONGTC, isClickable()),
                Click.on(BUTTON_REGIONGTC),
//                WaitUntil.the(BUTTON_GASTOS, isClickable()),
//                Click.on(BUTTON_GASTOS),
//                WaitUntil.the(BUTTON_TARIFA, isClickable()),
//                Click.on(BUTTON_TARIFA),
//                WaitUntil.the(BUTTON_APLICAR, isClickable()),
//                Click.on(BUTTON_APLICAR),
                WaitUntil.the(BUTTON_ENVIO, isClickable()),
                Click.on(BUTTON_ENVIO),
                WaitUntil.the(BUTTON_ORDEN, isClickable()),
                Click.on(BUTTON_ORDEN),
                WaitUntil.the(BUTTON_FIN, isClickable()),
                Click.on(BUTTON_FIN),
                WaitUntil.the(BUTTON_CERRAR_SESION_LOGOUT, isClickable()),
                Click.on(BUTTON_CERRAR_SESION_LOGOUT)
            );
        }
    }

    public Login user(String usuario){
        this.user = usuario;
        return  this;
    }

    public Login nombreCheck(String usuario){
        this.user= usuario;
        return  this;
    }

    public Login apellido(String usuario){
        this.user = usuario;
        return  this;
    }

    public Login direccion(String usuario){
        this.user = usuario;
        return  this;
    }

    public Login ciudad(String usuario){
        this.user = usuario;
        return  this;
    }

    public Login codigopostal(String codigopostal){
        this.user = codigopostal;
        return  this;
    }

    public Login cantidad (String usuario){
        this.user = usuario;
        return  this;
    }

    public Login password(String contrasenia){
        this.password = contrasenia;
        return this;
    }
    public static Login with(){
        return Tasks.instrumented(Login.class);
    }
}

