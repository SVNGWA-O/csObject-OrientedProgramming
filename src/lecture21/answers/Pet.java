package lecture21.answers;
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

    @Override
    public int hashCode(){
        // https://crypto.stackexchange.com/questions/48145/xor-a-set-of-random-numbers
        return this.name.hashCode() ^ this.owner.hashCode(); // XOR
    }
    
}
