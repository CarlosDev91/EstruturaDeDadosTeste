public class ListaDuplamenteLigada {
    NodeDuplo inicio, fim;
    int tamanho;
    
    public ListaDuplamenteLigada() {
        tamanho=0;
        inicio=fim=null;
    }
    //Método para adiciona na ultima posição da lista
    public void adicionar(Object info) {
        
        //Se inicio e fim forem null a lista está vazia
        if(inicio==null) {
            //Adiciona na primeira posição
            NodeDuplo novoNo = new NodeDuplo(info, null, null);
            inicio=fim=novoNo;
            tamanho++;
        }
        else{//adiciona na ultima posição
             //Cria o novo Nó com proximo apontamento para Null
             NodeDuplo novoNo = new NodeDuplo(info,null,fim);
             //Seta ProximoNo do ultimo Nó para o Novo Nó
             fim.setProximo(novoNo);
             fim = novoNo;
             tamanho++;
        }
    }
    public void adicionar(Object info, int indice){
        //Adicionar em qualquer posição
        NodeDuplo novoNo;
        if(indice==0){
            novoNo= new NodeDuplo(info, inicio, null);
            inicio.setAnterior(novoNo);
            inicio=novoNo;
            tamanho++;
        }else if(indice==tamanho-1){
            adicionar(info);
        }else if(indice < tamanho-1){
            NodeDuplo aux = percorreLista(indice);
            novoNo = new NodeDuplo(info,aux, aux.getAnterior());
            aux.setAnterior(novoNo);
            novoNo.getAnterior().setProximo(novoNo);
        }
    }
    
    public Object getLista(int indice) {
        //retorna a informação do nó apontando pelo indice
        return null;
    }
    private NodeDuplo percorreLista(int indice) {
        //Percorre a lista e retorna o Nó referente ao indice
        NodeDuplo aux;
        if(indice< tamanho/2){
            //Percorre a lista de inicio para o fim 
            aux=inicio;
            for (int i = 0; i < indice; i++) {
                aux=aux.getProximo();
            }
            return aux;
        }else{
            //Percorre a lista do fim para inicio
            aux=fim;
            for (int i = tamanho-1 ; i > indice; i--) {
            aux=aux.getAnterior();
        }
            return aux;
        }
        
    }
    
    public void imprimirTodaLista() {
        //Percorre toda a lista até o proximoNo == NULL
        NodeDuplo aux=inicio;
        while(aux!=null){
        System.out.println(aux.getInfo().toString());
        aux=aux.getProximo();
    }
    }
}
