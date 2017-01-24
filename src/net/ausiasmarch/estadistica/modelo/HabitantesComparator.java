package net.ausiasmarch.estadistica.modelo;

import java.util.Comparator;
import net.ausiasmarch.estadistica.modelo.Ciudad;

/**
 * HabitantesComparaor.java
 * @author Luis
 */
public class HabitantesComparator implements Comparator<Ciudad> {

    @Override
    /**
     * Compara los habitantes de dos objetos ciudad
     */
    public int compare(Ciudad ciudad1, Ciudad ciudad2) {
        if (ciudad1.getHabitantes() > ciudad2.getHabitantes()) {
            return 1; 
        }
        if (ciudad1.getHabitantes() < ciudad2.getHabitantes()) {
            return -1;
        }
        // son iguales
        return 0;
    }

}
