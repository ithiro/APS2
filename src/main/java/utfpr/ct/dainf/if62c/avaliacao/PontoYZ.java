/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1363140
 */
public class PontoYZ extends Ponto2D{
    
    private double x, y, z;
    
    protected PontoYZ() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    protected PontoYZ(double b, double c) {
        x = 0;
        y = b;
        z = c;
    }
    
    public String toString() {
        String titulo = getNome() + "(" + getY() + "," + getZ() + ")";
        return titulo;
    }
    
}
