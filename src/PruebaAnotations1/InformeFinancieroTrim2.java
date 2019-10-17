package PruebaAnotations1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
@Qualifier("iFt2")
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero1{
    
    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe catastrofico del trimestre 2";
    }
}
