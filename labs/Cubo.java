package labs.labs.aula46.labs;
/**
 *
 * @author Patricia
 */
public class Cubo extends Figura3D{
    
    private int lado;

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
         return 6 * (lado*lado);
    }
    
    
}
