
import java.util.*;

/**
 * 
 */
public class Casa {

	/**
	 * Constructor por defecto
	 */
    public Casa() {
    	
    }
    /**
     * Constructor que recibe como parametro la direccion, el num de habitaciones y los metros cuadrados de una casa del mundo real
     * 
     * @param direccion 				La direccion de la casa
     * @param numHabitaciones 	El numero de habitaciones de la casa
     * @param metrosCuadrados 	Los metros cuadrados de la casa
     */
    public  Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
        this.direccion=direccion;
        this.metrosCuadrados=metrosCuadrados;
        this.numHabitaciones=numHabitaciones;
    }

    /**
     * 
     */
    public String direccion;

    /**
     * 
     */
    public int numHabitaciones;

    /**
     * 
     */
    public int metrosCuadrados;

   

    /**
     * @return
     */
    public String getDireccion() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getNumHabitaciones() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getMetrosCuadrados() {
        // TODO implement here
        return 0;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        // TODO implement here
    }

    /**
     * @param numhabitaciones
     */
    public void setNumHabitaciones(int numhabitaciones) {
        // TODO implement here
    }

    /**
     * @param metrosCuadrados
     */
    public void setMetrosCuadrados(int metrosCuadrados) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}