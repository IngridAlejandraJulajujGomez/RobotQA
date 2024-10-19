package practica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final Target TEXTFIELD_USUARIO = Target.the("Campo Usuario")
            .locatedBy("//input[@id='customer_email']");
    public static final Target TEXTFIELD_CONTRASENIA = Target.the("Campo Contraseña")
            .locatedBy("//input[@id='customer_password']");
    public static final Target TEXTFIELD_NOMBRE = Target.the("Nombre")
            .locatedBy("//input[@id='order_shipping_address_name']");
    public static final Target BUTTON_CONTINUAR =Target.the("Botón CONTINUAR")
            .locatedBy("//*[@id='submit_login']");
    public static final Target BUTTON_INICIAR_SESION =Target.the("Botón INICIAR SESION")
            .locatedBy("//*[@id='submit_login']");
    public static final Target TEXT_VERIFICACIONTRANS = Target.the("h3")
            .locatedBy("//div[@class='container mt-3']//h3");
    public static final Target TEXT_TRANSPROGRAM = Target.the("Transacciones programadas")
            .locatedBy("//span[contains(text(),'Transacciones programadas')]");
    public static final Target BUTTON_MENU = Target.the("Botón MENU")
            .locatedBy("//*[@class='breadcrumb-item']");
    public static final Target BUTTON_PRODUCTO = Target.the("Botón ´PRODUCTO")
            .locatedBy("//*[@href='/wacom-tablet']");
    public static final Target TEXTFIELD_CANTIDAD = Target.the("cantidad")
            .locatedBy("//input[@id='input-qty']");
    public static final Target BUTTON_COLOR = Target.the("COLOR")
            .locatedBy("//label[@for='select_687719']");
    public static final Target BUTTON_CESTA = Target.the("CESTA")
            .locatedBy("//input[@type='submit']");
    public static final Target BUTTON_PAIS = Target.the("PAIS")
            .locatedBy("//select[@id='estimate_shipping_country']");
    public static final Target BUTTON_PAISGT = Target.the("PAIS")
            .locatedBy("//option[@value='GT']");
    public static final Target BUTTON_REGION = Target.the("REGION")
            .locatedBy("//select[@id='estimate_shipping_region']");
    public static final Target BUTTON_REGIONGT = Target.the("REGIONGT")
            .locatedBy("//option[@value='19']");
//    public static final Target BUTTON_GASTOS = Target.the("GASTOS")
//            .locatedBy("//input[@id='estimate_shipping_button']");
//    public static final Target BUTTON_TARIFA = Target.the("TARIFA")
//            .locatedBy("//input[@id='26339']");
//    public static final Target BUTTON_APLICAR = Target.the("APLICAR")
//            .locatedBy("//input[@id='set_shipping_button']");
    public static final Target BUTTON_ANADIR = Target.the("ANADIR")
            .locatedBy("//*[@title='Proceed to Checkout']");
    public static final Target TEXTFIELD_CORREOC = Target.the("correoc")
            .locatedBy("//input[@id='order_customer_email']");
    public static final Target TEXTFIELD_TELEFONOC= Target.the("telefonoc")
            .locatedBy("//input[@id='order_customer_phone']");
    public static final Target TEXTFIELD_APELLIDO = Target.the("apellido")
            .locatedBy("//input[@id='order_shipping_address_surname']");
    public static final Target TEXTFIELD_DIRECCION= Target.the("direccion")
            .locatedBy("//input[@id='order_shipping_address_address']");
    public static final Target TEXTFIELD_CIUDAD= Target.the("ciudad")
            .locatedBy("//input[@id='order_shipping_address_city']");
    public static final Target TEXTFIELD_CODIGOPOSTAL = Target.the("codigopostal")
            .locatedBy("//input[@id='order_shipping_address_postal']");
    public static final Target BUTTON_PAISC = Target.the("PAIS")
            .locatedBy("//select[@id='order_shipping_address_country']");
    public static final Target BUTTON_PAISGTC = Target.the("PAIS")
            .locatedBy("//option[@value='GT']");
    public static final Target BUTTON_REGIONC = Target.the("REGION")
            .locatedBy("//select[@id='order_shipping_address_region']");
    public static final Target BUTTON_REGIONGTC = Target.the("REGIONGT")
            .locatedBy("//option[@value='19']");
    public static final Target BUTTON_ENVIO = Target.the("ENVIO")
            .locatedBy("//input[@id='order_shipping_method_26338']");
    public static final Target BUTTON_ORDEN =Target.the("Botón ORDEN")
            .locatedBy("//input[@id='submit_review_order']");
    public static final Target BUTTON_FIN =Target.the("Botón FIN")
            .locatedBy("//input[@id='place_order']");
    public static final Target BUTTON_CERRAR_SESION_LOGOUT =Target.the("Botón CERRAR SESION")
            .locatedBy("//*[@href='/customer/destroy?id=14585400']");

    public static final Target BUTTON_DROPDOWN = Target.the("Consultar")
            .locatedBy("//div[@class='menu-option-label d-flex align-items-center p-0']/span[contains(text(),'Consultar.')]/..");



    //transferencias
    public static final Target TEXT_VERIFITRANSFERIR = Target.the("h3")
            .locatedBy("//h3");

    //ocultar y verificar transacciones
    public static final Target TEXT_VERIFICACIONTRANSS = Target.the("span")
            .locatedBy("//div[@class='p-breadcrumb p-component']//span");

    //gestion de favoritos
    public static final Target TEXT_FAVORITOS = Target.the("div con texto 'Gestionar mis favoritos'")
            .locatedBy("//div[contains(text(), 'Gestionar mis favoritos')]");

}

