package Branch;

public class Branch_feature {
    String name,id;
 double inc;
    public Branch_feature(String id,String name,double inc) {
        this.id = id; this.name = name; this.inc=inc;
    }

    public double getInc() {
        return inc;
    }

    public void setInc(double inc) {
        this.inc = inc;
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
