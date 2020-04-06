package animals;

import animals.entities.Cat;
import animals.entities.Dog;
import animals.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cont = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat =(Cat)cont.getBean(Cat.class);
         Dog dog =(Dog)cont.getBean("getDog");
      //  Parrot parrot =cont.getBean("kesha-parrot", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
      //  System.out.println(parrot.getName());

    }
}
