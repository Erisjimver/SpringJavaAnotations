package prueba;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ejecutora2 {

    public static void main(String[] args) {

       //Leer el xml de configuracion
       //ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");       
       
       //Leer la clase de configuracion
       AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
       
       //pedir un bean al contenedor
       //Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
       DirectorFinanciero empleado=contexto.getBean("directorFinanciero",DirectorFinanciero.class);
       
       //usar el bean
       //System.out.println(empleado.getTareas());
       //System.out.println(empleado.getInformes());
        System.out.println("Email del director: "+empleado.getEmail());
        System.out.println("Nombre de la empresa:"+empleado.getNombreEmpresa());
        //cerrar el contexto
       contexto.close();
        
    }
    
}