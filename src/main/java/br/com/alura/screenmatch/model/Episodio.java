package br.com.alura.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
<<<<<<< HEAD

=======
>>>>>>> 3322d4b (Ajustes para deixar aplicação mais objetiva e seguir o curso alura)
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        this.numeroEpisodio = dadosEpisodio.numero();
<<<<<<< HEAD
        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        }catch (NumberFormatException ex){
=======

        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException ex) {
>>>>>>> 3322d4b (Ajustes para deixar aplicação mais objetiva e seguir o curso alura)
            this.avaliacao = 0.0;
        }

        try {
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
<<<<<<< HEAD
        }catch (DateTimeParseException ex){
            this.dataLancamento = null;
        }


=======
        } catch (DateTimeParseException ex) {
            this.dataLancamento = null;
        }
>>>>>>> 3322d4b (Ajustes para deixar aplicação mais objetiva e seguir o curso alura)
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

<<<<<<< HEAD
    public void setNumeroEpisodio(Integer numero) {
        this.numeroEpisodio = numero;
=======
    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
>>>>>>> 3322d4b (Ajustes para deixar aplicação mais objetiva e seguir o curso alura)
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return
                "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
=======
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento ;
>>>>>>> 3322d4b (Ajustes para deixar aplicação mais objetiva e seguir o curso alura)
    }
}
