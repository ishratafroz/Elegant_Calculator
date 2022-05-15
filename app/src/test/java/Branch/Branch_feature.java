package Branch;

public class Branch_feature {
    String name,id;

    public Branch_feature(String id,String name) {
        this.id = id; this.name = name;
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
