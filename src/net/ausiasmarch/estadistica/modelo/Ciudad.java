package net.ausiasmarch.estadistica.modelo;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Ciudad.java Representa un ciudad
 *
 * @author Desarrollador
 */
public class Ciudad {
    // comunidad autonoma
    private String comunidad;
    // nombre de la ciudad
    @NotEmpty(message = " - Ciudad: No puede estar vacío")
    private String ciudad;
    // numero de habitantes
    @Min(value = 1, message = " - Habitantes: Debe ser mayor que 0")
    private long habitantes;


    /**
     * Constructor
     *
     * @param comunidad
     * @param ciudad
     * @param habitantes
     */
    public Ciudad(String comunidad, String ciudad, long habitantes) {
        this.comunidad = comunidad;
        this.ciudad = ciudad;
        this.habitantes = habitantes;
    }

    public Ciudad(String comunidad, String ciudad) {
        this.comunidad = comunidad;
        this.ciudad = ciudad;
        this.habitantes = 0;
    }
    
    /**
     * Constructor por defecto
     */
    public Ciudad() {
    }

    /**
     * Obtiene la comunidad
     * @return 
     */
    public String getComunidad() {
        return comunidad;
    }

    /**
     * Establece la comunidad
     * @param comunidad 
     */
    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    
    
    /**
     * Obtiene el nombre de la ciudad
     *
     * @return
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece el nombre de la ciudad
     *
     * @param ciudad
     */
    public void setNombre(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene los habitantes
     *
     * @return
     */
    public long getHabitantes() {
        return habitantes;
    }

    /**
     * Establece los habitantes
     *
     * @param habitantes
     */
    public void setHabitantes(long habitantes) {
        this.habitantes = habitantes;
    }

}
