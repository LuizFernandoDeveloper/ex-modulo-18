package entities;

import annotation.tabela;

@tabela(name = "Nome da tabela")
public class pessoa {

    private String name;

    public pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
