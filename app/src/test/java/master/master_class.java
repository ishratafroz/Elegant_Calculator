package master;

public class master_class {
    int roll; String name;

    public master_class(String name,int roll) {
        this.name = name; this.roll=roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
