public class ComplementaryPasses {
    private String passID;
    private String accessLevel;

    public String getPassID() {
        return passID;
    }

    public void setPassID(String passID) {
        this.passID = passID;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public ComplementaryPasses(String passID, String accessLevel) {
        this.passID = passID;
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return
                "passID:'" + passID + '\'' +
                ", accessLevel:'" + accessLevel + '\'' ;
    }
}