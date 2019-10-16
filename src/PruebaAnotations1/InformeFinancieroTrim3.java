package PruebaAnotations1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
@Qualifier("ift3")
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero1{
    
    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe favorable del trimestre 3";
    }
}
