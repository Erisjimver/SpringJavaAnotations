package PruebaAnotations1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ift4")
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero1{
    
    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe de cierre de año";
    }
}
