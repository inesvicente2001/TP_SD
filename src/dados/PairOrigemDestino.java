package dados;

import java.io.Serializable;

public class PairOrigemDestino implements Serializable {
    protected String origem;
    protected String destino;

    public PairOrigemDestino(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
