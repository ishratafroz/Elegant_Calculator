package Branch;

public class Branch_feature {
    String name,id;
 int cont;
    public Branch_feature(String id,String name,int cont) {
        this.id = id; this.name = name; this.cont=cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
