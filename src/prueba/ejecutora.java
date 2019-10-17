package prueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ejecutora {

    public static void main(String[] args) {

       //Leer el xml de configuracion
       ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");       
       
       //pedir un bean al contenedor
       Empleados Israel = contexto.getBean("comercialExperimentado",Empleados.class);
       
       //usar el bean
       System.out.println(Israel.getInformes());
       System.out.println(Israel.getTareas());       
        
       //cerrar el contexto
       contexto.close();
        
    }
    
}