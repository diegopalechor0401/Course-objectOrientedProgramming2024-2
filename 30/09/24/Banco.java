public class Banco{

    private String NIT;
    private String razonSocial;

    public Banco (final String NIT, final String razonSocial){
        this.NIT=NIT;
        this.razonSocial=razonSocial;

    }
    public void setNIT(String NIT) {
        NIT = NIT;
    }
    

    @Override
    public String toString() {
        return "Banco [NIT=" + NIT + ", razonSocial=" + razonSocial + "]";
    }

}