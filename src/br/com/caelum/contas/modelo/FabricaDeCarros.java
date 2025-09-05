package br.com.caelum.contas.modelo;

public class FabricaDeCarros {
    private static volatile FabricaDeCarros instancia = null;
    
    private String nome;

    private FabricaDeCarros() {
        this.nome = "Ford";
    }

    public static FabricaDeCarros getInstancia() {
        if (instancia == null) {
            synchronized (FabricaDeCarros.class) {
                if (instancia == null) {
                    instancia = new FabricaDeCarros();
                }
            }
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }
}

