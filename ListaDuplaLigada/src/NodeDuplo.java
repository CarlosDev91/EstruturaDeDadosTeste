/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class NodeDuplo {
    private Object info;
    private NodeDuplo proximo, anterior;

    public NodeDuplo(Object info, NodeDuplo proximo, NodeDuplo anterior) {
        this.info = info;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NodeDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NodeDuplo proximo) {
        this.proximo = proximo;
    }

    public NodeDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodeDuplo anterior) {
        this.anterior = anterior;
    }
    
    
}
