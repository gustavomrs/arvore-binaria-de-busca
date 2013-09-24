public class Test {
    public static void main(String args[])
    {
        ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();
 
        tree.insere(8);
        
        //Caso 1.1 Remover Raiz
        tree.remove(8);
        System.out.println("Imprimindo a arvore - Caso 1.1:");
        System.out.println(tree);
        
               
        //Caso 1.2 Remover Raiz com Filho Esquerdo
        tree.insere(8);
        tree.insere(3);
        tree.remove(8);
        System.out.println("Imprimindo a arvore - Caso 1.2:");
        System.out.println(tree);
        tree.remove(3);
        
        //Caso 1.3 Remover Raiz com Filho Direito
        tree.insere(8);
        tree.insere(14);
        tree.remove(8);        
        System.out.println("Imprimindo a arvore - Caso 1.3:");
        System.out.println(tree);
        tree.remove(14);
        
        
        //Caso 1.4 Remover Raiz com Filhos Direito e Esquerdo
        tree.insere(8);
        tree.insere(3);
        tree.insere(14);                
        tree.remove(8);        
        System.out.println("Imprimindo a arvore - Caso 1.4:");
        System.out.println(tree);
        tree.remove(14);
        tree.remove(3);
        
                
        tree.insere(8);
        tree.insere(3);
        tree.insere(10);                
        tree.insere(1);
        tree.insere(6);
        tree.insere(14);
        tree.insere(4);
        tree.insere(7);
        tree.insere(13);
        
        
        
        System.out.println("Imprimindo a arvore completa");
        System.out.println(tree);   

        
        //Caso 2  Remover folha
        tree.remove(4);
        System.out.println("Imprimindo a arvore - Caso 2");
        System.out.println(tree);
        
        //Caso 3.1 Remover no com apenas o filho direito
        tree.remove(6);
        System.out.println("Imprimindo a arvore - Caso 3.1");
        System.out.println(tree);
        
        //Caso 3.2 Remover no com apenas o filho esquerdo
        tree.remove(14);
        System.out.println("Imprimindo a arvore - Caso 3.2");
        System.out.println(tree);
        
        //Caso 4  Remover no com dois filhos (no nao raiz)
        tree.remove(3);
        System.out.println("Imprimindo a arvore - Caso 4");
        System.out.println(tree);
        
        tree.remove(8);
        System.out.println("Imprimindo a arvore");
        System.out.println(tree);
        
        tree.remove(1);
        System.out.println("Imprimindo a arvore");
        System.out.println(tree);
        
        tree.remove(7);
        System.out.println("Imprimindo a arvore");
        System.out.println(tree);
        
        tree.remove(10);
        System.out.println("Imprimindo a arvore");
        System.out.println(tree);
        
        tree.remove(13);
        System.out.println("Imprimindo a arvore");
        System.out.println(tree);
        
        tree.insere(8);
        tree.insere(3);
        tree.insere(10);                
        tree.insere(1);
        tree.insere(6);
        tree.insere(14);
        tree.insere(4);
        tree.insere(7);
        tree.insere(13);
        
        System.out.println("Imprimindo a arvore completa");
        System.out.println(tree);
        
        //Caso 4  Remover no com dois filhos (no nao raiz)
        tree.remove(3);
        System.out.println("Imprimindo a arvore - Caso 4 (testando novamente, com arvore mais completa)");
        System.out.println(tree);       
    }
}