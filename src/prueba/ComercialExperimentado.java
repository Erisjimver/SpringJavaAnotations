package prueba;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
@Component
//@Scope("prototype")
@Scope("singleton")
public class ComercialExperimentado implements Empleados{

    @Autowired
    @Qualifier("informeFinancieroTrim4")    
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
    
    //ejecutar despues de crear bean
    @PostConstruct
    public void ejecutaDespuesCreacion(){
        System.out.println("Funciona despues de la creacion del bean");
    }
    
    //ejecutar despues de apagar contenedor spring
    @PreDestroy
    public void ejecutaAntesDestruccion(){
           System.out.println("Eejcutado antes de la destrucion");
    }
}