package prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
@Component
public class ComercialExperimentado implements Empleados{

    @Autowired
    @Qualifier("informeFinancieroTrim3")    
    private CreacionInformeFinanciero nuevoInforme;
    /*
    @Autowired
    @Qualifier("informeFinancieroTrim2")   
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }
    */
    /*
    @Autowired
    @Qualifier("informeFinancieroTrim2")
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }
    */
    @Override
    public String getTareas() {
        return "Vender mas";
    }

    @Override
    public String getInformes() {
        //return "Informe generado por el comercial";
        return nuevoInforme.getInformeFinanciero();
    }
    

    
}