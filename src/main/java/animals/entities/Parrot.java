package animals.entities;

import org.springframework.stereotype.Component;

@Component("kesha-parrot")
public class Parrot {
    private String name="Kesha";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
