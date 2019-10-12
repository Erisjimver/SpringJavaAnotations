package PruebaAnotations;

import org.springframework.stereotype.Component;

@Component 
public class informeFinancieroTrim implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe financiero";
    }
    
}
