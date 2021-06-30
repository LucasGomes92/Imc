package br.com.imc.utils;
public class Imc{

    private Double peso;
    private Double altura;
    private int sexo;


    public Double getPeso() {

        return peso ;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String calcularImc() {
        Double imc = getPeso() / (Math.pow(getAltura(),2));
        // 0= masculino
        if (getSexo() == 0) {
            if (imc < 20.7) {
                return "Abaixo do peso.";
            }
            if (imc < 26.4) {
                return "Peso normal.";
            }
            if (imc < 27.8) {
                return "Levemente acima do peso.";
            }
            if (imc < 31.1) {
                return "Acima do peso.";
            } else {
                return "Obeso.";
            }
        } else {
            if (imc < 19.1) {
                return "Abaixo do peso.";
            } else if (imc < 25.8) {
                return "Peso normal.";
            } else if (imc < 27.3) {
                return "Levemente acima do peso.";
            } else if (imc < 32.3) {
                return "Acima do peso.";
            } else {
                return "Obeso.";
            }
        }
    }
}