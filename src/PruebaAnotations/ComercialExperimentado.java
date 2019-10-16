package PruebaAnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado1")
@Component
public class ComercialExperimentado implements Empleados{
    
    @Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    
    @Override
    public String getTareas() {
        return "Vender mas";
    }

    @Override
    public String getInformes() {
        //return "Informe generado por el comercial";
        return nuevoInforme.getInformeFinanciero();
    }
    
    @Autowired
    private CreacionInformeFinanciero nuevoInforme;
    
}