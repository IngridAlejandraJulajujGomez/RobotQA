package practica.utils;

import practica.models.Client;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class setDataClient {
    public static Client withCobisId(int cobisId) throws IOException{

        Client client = new Client();
        Properties prop = new Properties();

        prop.load(new FileReader("./src/test/resources/properties/credentials.properties"));

        /*client.setNombre(System.getenv(prop.getProperty("user["+cobisId+"][PIPELINE].nombre")));
        if(client.getUsuario()!=null){
            client.setUsuario(System.getenv(prop.getProperty("user["+cobisId+"][PIPELINE].username")));
            client.setContrasenia(System.getenv(prop.getProperty("user["+cobisId+"][PIPELINE].password")));
            client.setImagen(System.getenv(prop.getProperty("user["+cobisId+"][PIPELINE].image")));
            client.setFrase(System.getenv(prop.getProperty("user["+cobisId+"][PIPELINE].phrase")));
        }

        else{*/
            client.setName(prop.getProperty("user["+cobisId+"][LOCAL].nombre"));
            client.setUser(prop.getProperty("user["+cobisId+"][LOCAL].username"));
            client.setPassword(prop.getProperty("user["+cobisId+"][LOCAL].password"));
            client.setPhrase(prop.getProperty("user["+cobisId+"][LOCAL].phrase"));
        //}
        client.setnombreCheck(prop.getProperty("user["+cobisId+"][LOCAL].nombreCheck"));
        client.setapellido(prop.getProperty("user["+cobisId+"][LOCAL].apellido"));
        client.setdireccion(prop.getProperty("user["+cobisId+"][LOCAL].direccion"));
        client.setciudad(prop.getProperty("user["+cobisId+"][LOCAL].ciudad"));
        client.setcodigopostal(prop.getProperty("user["+cobisId+"][LOCAL].codigopostal"));
        client.setcantidad(prop.getProperty("user["+cobisId+"][LOCAL].cantidad"));
        return client;
    }
}
