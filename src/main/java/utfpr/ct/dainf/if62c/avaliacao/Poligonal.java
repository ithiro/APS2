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
public class Poligonal {
    int v;
    Ponto2D[] vertices;
    
    public Poligonal(int a) {
        v = a;
        if (v > 2) {throw new RuntimeException("Poligonal deve ter ao menos 2 vértices.");}
        vertices = new Ponto2D[v];
    }
    
    public int getN() {return v;}
    
    public Ponto2D get(int a) {
        if (v > a == true) {return vertices[a];}
        else return null;
    }
    
    public void set(int a, Ponto2D b) {
        if (v > a == true) {
            if (vertices[0].getNome().equals(b.getNome()) == true) {vertices[a] = b;}
            else throw new RuntimeException("Vértices devem estar no mesmo plano.");
        }
    }
    
    public double getComprimento()  {
        double soma = 0;
        for (int i = 0; i < vertices.length-1; i++) {
        soma += vertices[i].dist(vertices[i+1]);
        }
        return soma;
    }
}
