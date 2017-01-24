package net.ausiasmarch.estadistica.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * GestorCiudades.java
 *
 * @author Desarrollador
 */
public class GestorCiudades {

    // Lista de ciudades
    private List<Ciudad> ciudades;

    /**
     * Constructor
     */
    public GestorCiudades() {
        ciudades = new ArrayList<>();
    }

    /**
     * Obtiene la lista de ciudades
     *
     * @return List
     */
    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    /**
     * Establece la lista de ciudades
     *
     * @param ciudades
     */
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    /**
     * Obtiene la suma de habitantes de todas las ciudades
     *
     * @return int
     */
    public int sumaHabitantes() {
        int suma = 0;
        for (Ciudad ciudad : ciudades) {
            suma += ciudad.getHabitantes();
        }
        return suma;
    }

    /**
     * Obtiene el numero de ciudades de la lista
     *
     * @return int
     */
    public int numCiudades() {
        return ciudades.size();
    }

    /**
     * Obtiene la media de habitantes de las ciudades
     *
     * @return double
     */
    public double mediaHabitantes() {
        return sumaHabitantes() / numCiudades();
    }

    /**
     * Ordena las ciudades de menor a mayor habitantes
     */
    public void ordenarHabitantesAsc() {
        Collections.sort(ciudades, new HabitantesComparator());
    }

    /**
     * Ordena las ciudades por de mayor a menor habitantes
     */
    public void ordenarHabitantesDesc() {
        ordenarHabitantesAsc();
        Collections.reverse(ciudades);
    }

    /**
     * Ordena las ciudades alfabetiamente por comunidad y ciudad
     */
    public void ordenarComunidadCiudad() {
        Collections.sort(ciudades, new NombreComparator());
    }

    /**
     * Busca la ciudad con el nombre indicado
     *
     * @param nombre
     * @return List
     */
    public Ciudad buscarCiudad(String nombre) {
        Collections.sort(ciudades, new NombreCiudadComparator());
        int indice = Collections.binarySearch(ciudades, new Ciudad(null,nombre,0),new NombreCiudadComparator());
        if (indice >= 0) {
            return ciudades.get(indice);
        }
        return null;
    }

    /**
     * Borra la ciudad con el nombre indicado
     *
     * @param nombre
     * @return List
     */
    public boolean borrarCiudad(String nombre) {
        return ciudades.remove(buscarCiudad(nombre));
    }

    /**
     * Obtiene la ciudad con mayor habitantes
     * @return Ciudad
     */
    public Ciudad ciudadMayorHabitantes(){
        return Collections.max(ciudades, new HabitantesComparator());
    }
    
    
    /**
     * Convierte un objeto Ciudad en un List
     *
     * @param ciudad
     * @return
     */
    public List asListCiudad(Ciudad ciudad) {
        List lista = new ArrayList();
        lista.add(ciudad.getComunidad());
        lista.add(ciudad.getCiudad());
        lista.add(ciudad.getHabitantes());
        return lista;
    }

    /**
     * Convierte un Lista de objetos ciudad en un list de list con los datos de
     * cada ciudad
     *
     * @param ciudades
     * @return
     */
    public List<List> aslistaCiudades(List<Ciudad> ciudades) {
        List<List> lista = new ArrayList();
        for (Ciudad c : ciudades) {
            lista.add(asListCiudad(c));
        }
        return lista;
    }

  
}
