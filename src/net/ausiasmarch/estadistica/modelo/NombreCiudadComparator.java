package net.ausiasmarch.estadistica.modelo;

import java.util.Comparator;

/**
 * NombreCiudadComparator.java
 *
 * @author Luis
 */
public class NombreCiudadComparator implements Comparator<Ciudad> {

    /**
     * Compara dos nombres de ciudad
     *
     * @param c1
     * @param c2
     */
    @Override
    public int compare(Ciudad c1, Ciudad c2) {
        return c1.getCiudad().compareToIgnoreCase(c2.getCiudad());
    }
}
