package PruebaAnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
@Component
public class comercialExperimentado implements Empleados{
    
    @Autowired
    public comercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
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
    
    private CreacionInformeFinanciero nuevoInforme;
    
}