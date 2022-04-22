package br.com.storsaleapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee extends Person {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
