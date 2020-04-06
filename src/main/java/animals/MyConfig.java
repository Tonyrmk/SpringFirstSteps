package animals;

import animals.entities.Cat;
import animals.entities.Dog;
import animals.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat(){
        return new Cat();
    }
    @Bean
    public Dog getDog(){
        return new Dog();
    }
    @Bean("parrot-kesha")
    public Object weNeedMoreParrots() {
        return new Parrot();
    }
    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }
}
