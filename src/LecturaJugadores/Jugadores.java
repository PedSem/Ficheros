package LecturaJugadores;

import java.io.*;

public class Jugadores {
    private int rankinginicial;
    private String nobmrejugador;

    public Jugadores(int rankinginicial, String nobmrejugador) {
        this.rankinginicial = rankinginicial;
        this.nobmrejugador = nobmrejugador;
    }

    public int getRankinginicial() {
        return rankinginicial;
    }

    public void setRankinginicial(int rankinginicial) {
        this.rankinginicial = rankinginicial;
    }

    public String getNobmrejugador() {
        return nobmrejugador;
    }

    public void setNobmrejugador(String nobmrejugador) {
        this.nobmrejugador = nobmrejugador;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "rankinginicial=" + rankinginicial +
                ", nobmrejugador='" + nobmrejugador + '\'' +
                '}';
    }
}
