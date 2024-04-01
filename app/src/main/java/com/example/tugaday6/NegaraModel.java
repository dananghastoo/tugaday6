package com.example.tugaday6;

public class NegaraModel {
    private String namaNegara;
    private  int logoBendera;
    private  String deskripsiNegara;

    public NegaraModel(String namaNegara, int logoBendera, String deskripsiNegara) {
        this.namaNegara = namaNegara;
        this.logoBendera = logoBendera;
        this.deskripsiNegara = deskripsiNegara;

    }

    public  String getDeskripsiNegara(){
        return deskripsiNegara;
    }
    public void  setDeskripsiNegara(String deskripsiNegara){
        this.deskripsiNegara = deskripsiNegara;

    }

    public String getNamaNegara() {
        return namaNegara;
    }

    public void setNamaNegara(String namaNegara) {
        this.namaNegara = namaNegara;
    }

    public int getLogoBendera() {
        return logoBendera;
    }

    public void setLogoBendera(int logoBendera) {
        this.logoBendera = logoBendera;
    }
}
