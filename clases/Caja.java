public class Caja extends Medidas{
    String material;
    String empresa;
    String lote;

    public Caja(String material, String empresa, String lote, Integer alto, Integer largo, Integer ancho) {
        super(alto, largo, ancho);
        this.material = material;
        this.empresa = empresa;
        this.lote = lote;
    }

    @Override
    public String obtenerVolumen() {
        return "Inválido";
    }
}