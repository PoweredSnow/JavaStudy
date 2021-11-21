public class Student {
    private int sNO;
    private String sName;
    private String sGender;
    private Major sMajor;

    public Student(int sNO, String sName, String sGender, Major sMajor) {
        this.sNO = sNO;
        this.sName = sName;
        this.sGender = sGender;
        this.sMajor = sMajor;
    }

    public int getsNO() {
        return sNO;
    }

    public void setsNO(int sNO) {
        this.sNO = sNO;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public Major getsMajor() {
        return sMajor;
    }

    public void setsMajor(Major sMajor) {
        this.sMajor = sMajor;
    }

}
