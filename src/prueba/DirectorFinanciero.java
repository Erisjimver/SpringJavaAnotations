package prueba;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

    private CreacionInformeFinanciero informeFinanciero;
    @Value("${email}")
    private String email;
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;
    
    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    @Override
    public String getTareas() {
        return "Tareas del director";
    }

    @Override
    public String getInformes() {
        return informeFinanciero.getInformeFinanciero();
    }
       
}
