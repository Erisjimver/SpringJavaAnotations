package PruebaAnotations;
import org.springframework.stereotype.Component;

@Component 
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero{
    
    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe catastrofico del trimestre 2";
    }
}