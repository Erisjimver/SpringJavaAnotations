package PruebaAnotations;

import org.springframework.stereotype.Component;

@Component 
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero{
    
    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe de cierre de año";
    }
}
