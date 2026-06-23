import java.util.ArrayList;
import java.util.List;

public class GerenciadorImersao {
    private List<RegistrarImersao> listaDeRegistros = new ArrayList<>();

    public void adicionar(RegistrarImersao registrar) {
        listaDeRegistros.add(registrar);
    }

    public int calcularTempoTotal() {
        int tempo = 0;
        for (RegistrarImersao registrar : listaDeRegistros) {
            tempo += registrar.getTempo();
        }
        return tempo;
    }
}
