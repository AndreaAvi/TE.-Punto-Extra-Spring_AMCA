package mx.unam.aragon.ico.te.animalesmarmvc.modelos;

public class AnimalMarino {

    private String especie;
    private double tamañoPromedio; // en metros
    private String profundidadHabitat; // en metros
    private String tipoAlimentacion;
    private String zonaGeografica;
    private String modoDesplazamiento;
    private int esperanzaVida; // en años
    private String estadoConservacion; 
    private String urlInformacion;
    private String imagen;

    public AnimalMarino() {
    }

    public AnimalMarino(String especie, double tamañoPromedio, String profundidadHabitat, String tipoAlimentacion, String zonaGeografica, String modoDesplazamiento, int esperanzaVida, String estadoConservacion, String urlInformacion, String imagen) {
        this.especie = especie;
        this.tamañoPromedio = tamañoPromedio;
        this.profundidadHabitat = profundidadHabitat;
        this.tipoAlimentacion = tipoAlimentacion;
        this.zonaGeografica = zonaGeografica;
        this.modoDesplazamiento = modoDesplazamiento;
        this.esperanzaVida = esperanzaVida;
        this.estadoConservacion = estadoConservacion;
        this.urlInformacion = urlInformacion;
        this.imagen = imagen;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamañoPromedio() {
        return tamañoPromedio;
    }

    public void setTamañoPromedio(double tamañoPromedio) {
        this.tamañoPromedio = tamañoPromedio;
    }

    public String getProfundidadHabitat() {
        return profundidadHabitat;
    }

    public void setProfundidadHabitat(String profundidadHabitat) {
        this.profundidadHabitat = profundidadHabitat;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getZonaGeografica() {
        return zonaGeografica;
    }

    public void setZonaGeografica(String zonaGeografica) {
        this.zonaGeografica = zonaGeografica;
    }

    public String getModoDesplazamiento() {
        return modoDesplazamiento;
    }

    public void setModoDesplazamiento(String modoDesplazamiento) {
        this.modoDesplazamiento = modoDesplazamiento;
    }

    public int getEsperanzaVida() {
        return esperanzaVida;
    }

    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public String getUrlInformacion() {
        return urlInformacion;
    }

    public void setUrlInformacion(String urlInformacion) {
        this.urlInformacion = urlInformacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "AnimalMarino{" +
                "especie='" + especie + '\'' +
                ", tamañoPromedio=" + tamañoPromedio +
                ", profundidadHabitat='" + profundidadHabitat + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                ", zonaGeografica='" + zonaGeografica + '\'' +
                ", modoDesplazamiento='" + modoDesplazamiento + '\'' +
                ", esperanzaVida=" + esperanzaVida +
                ", estadoConservacion='" + estadoConservacion + '\'' +
                ", urlInformacion='" + urlInformacion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
