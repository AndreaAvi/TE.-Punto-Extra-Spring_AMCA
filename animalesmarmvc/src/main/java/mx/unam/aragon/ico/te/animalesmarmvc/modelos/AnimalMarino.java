package mx.unam.aragon.ico.te.animalesmarmvc.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.*;

@Entity
@Table(name = "animales_marinos")
public class AnimalMarino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String especie;

    @Column(name = "tamanio_promedio", nullable = false)
    private double tamanioPromedio; // en metros

    @Column(name = "profundidad_habitat", length = 50)
    private String profundidadHabitat; // en metros, texto como "200-1000m"

    @Column(name = "tipo_alimentacion", length = 50)
    private String tipoAlimentacion;

    @Column(name = "zona_geografica", length = 100)
    private String zonaGeografica;

    @Column(name = "modo_desplazamiento", length = 50)
    private String modoDesplazamiento;

    @Column(name = "esperanza_vida")
    private int esperanzaVida; // en años

    @Column(name = "estado_conservacion", length = 50)
    private String estadoConservacion;

    @Column(name = "url_informacion", length = 255)
    private String urlInformacion;

    @Column(length = 255)
    private String imagen; // URL o path local

    public AnimalMarino() {
    }

    public AnimalMarino(int id, String especie, double tamanioPromedio, String profundidadHabitat, String tipoAlimentacion, String zonaGeografica, String modoDesplazamiento, int esperanzaVida, String estadoConservacion, String urlInformacion, String imagen) {
        this.id = id;
        this.especie = especie;
        this.tamanioPromedio = tamanioPromedio;
        this.profundidadHabitat = profundidadHabitat;
        this.tipoAlimentacion = tipoAlimentacion;
        this.zonaGeografica = zonaGeografica;
        this.modoDesplazamiento = modoDesplazamiento;
        this.esperanzaVida = esperanzaVida;
        this.estadoConservacion = estadoConservacion;
        this.urlInformacion = urlInformacion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamanioPromedio() {
        return tamanioPromedio;
    }

    public void setTamanioPromedio(double tamañoPromedio) {
        this.tamanioPromedio = tamañoPromedio;
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
                "id=" + id +
                ", especie='" + especie + '\'' +
                ", tamañoPromedio=" + tamanioPromedio +
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