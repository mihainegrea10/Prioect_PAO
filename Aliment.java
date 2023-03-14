public class Aliment {
    private double pret;
    private String dataExpirare;
    private String ingrediente;
    private double calorii;
    private String tipAliment;

    public Aliment(double pret, String dataExpirare, String ingrediente, double calorii, String tipAliment) {
        this.pret = pret;
        this.dataExpirare = dataExpirare;
        this.ingrediente = ingrediente;
        this.calorii = calorii;
        this.tipAliment = tipAliment;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getCalorii() {
        return calorii;
    }

    public void setCalorii(double calorii) {
        this.calorii = calorii;
    }

    public String getTipAliment() {
        return tipAliment;
    }

    public void setTipAliment(String tipAliment) {
        this.tipAliment = tipAliment;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "pret=" + pret +
                ", dataExpirare='" + dataExpirare + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", calorii=" + calorii +
                ", tipAliment='" + tipAliment + '\'' +
                '}';
    }
}
