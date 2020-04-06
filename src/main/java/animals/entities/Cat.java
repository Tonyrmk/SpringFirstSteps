package animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name ="Bars";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
