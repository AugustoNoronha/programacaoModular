package Models.Classes;

public class Sala {
    private int Codigo;
    private int IdPredio;

    public Sala() {
    }

    public Sala(int codigo, int idPredio) {
        Codigo = codigo;
        IdPredio = idPredio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getIdPredio() {
        return IdPredio;
    }

    public void setIdPredio(int idPredio) {
        IdPredio = idPredio;
    }
}
