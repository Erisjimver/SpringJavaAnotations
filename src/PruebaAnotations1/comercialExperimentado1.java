package PruebaAnotations1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
@Component
public class comercialExperimentado1 implements Empleados1{
    
    @Autowired
    public comercialExperimentado1(CreacionInformeFinanciero1 nuevoInforme) {
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
    @Qualifier("informeFinancieronTrim1")
    private CreacionInformeFinanciero1 nuevoInforme;
    
}