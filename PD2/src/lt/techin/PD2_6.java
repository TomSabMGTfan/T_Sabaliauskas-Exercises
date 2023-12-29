package lt.techin;




public class PD2_6 {

    String marke;
    String modelis;
    int metai;

//    public static void main(String[] args) {

    public PD2_6(String marke, String modelis, int metai) {

        this.marke = marke;
        this.modelis = modelis;
        this.metai = metai;
    }

    //Getter
    public String getMarke() {
        return marke;
    }

    //Setter
    public void setMarke(String marke) {
        this.marke = marke;
    }

    //Getter
    public String getModelis() {
        return modelis;
    }

    //Setter
    public void setModelis(String modelis) {
        this.modelis = modelis;
    }  //Getter

    public int getMetai() {
        return metai;
    }

    //Setter
    public void setMetai(int metai) {
        this.metai = metai;
    }

    void displayInfo() {
        System.out.println(marke + " " + modelis + " " + metai);

    }

}
