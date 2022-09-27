package com.uniesp.aula1.padroesdeprojetos.atividadeMercado;

import java.text.SimpleDateFormat;

public interface DiaEHorario{

    int diaDaSemana(int dia);
    String diaDaSemanaExtenso(int dia);
    String horario(int hora, int min, int seg);
}
