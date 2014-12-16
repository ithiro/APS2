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
public class PoligonalFechada extends Poligonal {
    int v;
    Ponto2D[] vertices;
    
    public PoligonalFechada(int a) {
        v = a;
        if (v > 2) {throw new RuntimeException("Poligonal deve ter ao menos 2 vértices.");}
        vertices = new Ponto2D[v];
    }
    
    public double getComprimento()  {
        double soma = 0;
        for (int i = 0; i < vertices.length-1; i++) {
        soma += vertices[i].dist(vertices[i+1]);
        }
        soma += vertices[0].dist(vertices[vertices.lenght]);
        return soma;
    }
}
