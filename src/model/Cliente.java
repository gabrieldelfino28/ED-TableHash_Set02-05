package model;

public class Cliente {
    public int numConta;
    public String nome;
    public double saldo;

    public Cliente(int numConta, String nome, double saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Cliente() {
        super();
    }

    @Override
    public String toString() {
        return
                "numConta=" + numConta +
                ";nome='" + nome + '\'' +
                ";saldo=" + saldo;
    }
}
