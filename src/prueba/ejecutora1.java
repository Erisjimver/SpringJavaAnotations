package prueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ejecutora1 {

    public static void main(String[] args) {

       //Leer el xml de configuracion
       ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");       
       
       //pedir un bean al contenedor
       Empleados Israel = contexto.getBean("comercialExperimentado",Empleados.class);
       Empleados Manuel = contexto.getBean("comercialExperimentado",Empleados.class);
       
       //usar el bean
        System.out.println(Israel);
        System.out.println(Manuel);
        if(Israel==Manuel){
            System.out.println("Apuntan al mismo lugar en memoria");
        }
        else{
            System.out.println("Apuntan a un lugar diferente");
        }
       //cerrar el contexto
       contexto.close();
        
    }
    
}