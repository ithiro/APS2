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
public abstract class Ponto2D extends Ponto{
    
    private double x, y, z;
    
    protected Ponto2D() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    protected Ponto2D(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }
    
}
