package lecture21.activity;
public class Pet {
    private String name;
    private String owner;

    public Pet(String name, String owner){
        this.name = name;
        this.owner = owner;
    }

    public boolean equals(Object o){
        if(o instanceof Pet p){
            return this.name.equals(p.name) &&
                    this.owner.equals(p.owner);
        }
        return false;
    }
    
}
