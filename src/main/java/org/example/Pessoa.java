package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

  public int getIDade() {
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
  }

    public boolean eMaiorIdade() {
        return getIDade() >= 18;
    }
}