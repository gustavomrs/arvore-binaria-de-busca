/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.facom.estrutura.arvore.binaria;

/**
 *
 * @author gustavo
 */
public class No {
    private int valor;
    private No direita;
    private No esquerda;

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the direita
     */
    public No getDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(No direita) {
        this.direita = direita;
    }

    /**
     * @return the esquerda
     */
    public No getEsquerda() {
        return esquerda;
    }

    /**
     * @param esquerda the esquerda to set
     */
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No() {
        ;
    }

    public No(int valor){
        this.valor = valor;
    }
    
    public No(int valor, No direita, No esquerda) {
        this.valor = valor;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public String toString() {
        return Integer.toString(this.getValor()); //To change body of generated methods, choose Tools | Templates.
    }
    
    public No sucessor(No no)
    {
        No sucessor = no;
        
        sucessor = sucessor.getDireita();
        
        while(sucessor.getEsquerda() != null)
            sucessor = sucessor.getEsquerda();
        
        return sucessor;
    }
    
    public No antecessor(No no)
    {
        No antecessor = no;
        
        antecessor = antecessor.getEsquerda();
        
        while(antecessor.getDireita() != null)
        {
            antecessor = antecessor.getDireita();
        }
        
        return antecessor;
    }
   
    
}
