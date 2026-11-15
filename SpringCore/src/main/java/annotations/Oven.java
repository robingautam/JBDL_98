package annotations;

public class Oven {

    String ovenName;

    public String getOvenName() {
        return ovenName;
    }

    public void setOvenName(String ovenName) {
        this.ovenName = ovenName;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "ovenName='" + ovenName + '\'' +
                '}';
    }
}
