package PruebaAnotations1;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero1{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe financiero";
    }
    
}
