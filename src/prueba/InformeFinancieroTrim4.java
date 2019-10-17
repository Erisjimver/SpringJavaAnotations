package prueba;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe financiero del trimestre 4 fin de año";
    }
    
}
