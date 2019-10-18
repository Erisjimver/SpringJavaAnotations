package prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("prueba")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
    
    //definir en bean para InformeFinancieroDepartamentoCompras
    @Bean
    public CreacionInformeFinanciero informeFinancieroDepartamentoCompras(){//id del bean inyectado
        return new InformeFinancieroDepartamentoCompras();
    }
    
    
    
    
    //definir el bean para el director e inyectar dependencias
    @Bean
    public Empleados directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroDepartamentoCompras());//inyecion
    }
}   