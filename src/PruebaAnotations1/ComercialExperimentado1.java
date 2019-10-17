package PruebaAnotations1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
@Component
public class ComercialExperimentado1 implements Empleados1{
    
    @Autowired
    public ComercialExperimentado1(CreacionInformeFinanciero1 nuevoInforme) {
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
    @Qualifier("iFt2")
    private CreacionInformeFinanciero1 nuevoInforme;
    
}