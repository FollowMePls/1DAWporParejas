package net.ausiasmarch.estadistica.modelo;

import java.util.Comparator;
import net.ausiasmarch.estadistica.modelo.Ciudad;

/**
 *
 * @author Luis
 */
public class NombreComparator implements Comparator<Ciudad> {

    @Override
    public int compare(Ciudad c1, Ciudad c2) {

         if (c1.getComunidad().equals(c2.getComunidad())){  
            return c1.getCiudad().compareToIgnoreCase(c2.getCiudad());
         }
         return c1.getComunidad().compareToIgnoreCase(c2.getComunidad());
      } 

}
