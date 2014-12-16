package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;
    
    public Ponto() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    public Ponto(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }
    
    @Override
    public String toString() {
        String titulo = getNome() + "(" + getX() + "," + getY() + "," + getZ() + ")";
        return titulo;
    }
    
    public boolean equals(Ponto a) {
        if (a.getX() == getX() && a.getY() == getY() && a.getZ() == getZ()) return true;
        else return false;
    }
    
    public double dist(Ponto a) {
        double result = Math.sqrt(
                (a.getX()-getX())*(a.getX()-getX()) +
                (a.getY()-getY())*(a.getY()-getY()) +
                (a.getZ()-getZ())*(a.getZ()-getZ()) );
        return result;
    }

    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

}
