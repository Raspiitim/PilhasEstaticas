package teste;

public class Pilha {
	private Object elemento[];
	private int topo;
	
	public Pilha(int capacidade) {
		this.topo = -1;
		this.elemento = new Object[capacidade];
	}
	
	//adiciona
	public Boolean push(Object elemento) {
		if(this.topo < this.elemento.length-1) {
			this.topo++;
			this.elemento[topo] = elemento;
			return true;
		}
		return false;
	}
	
	// Adiciona um elemento à pilha
    public Boolean pushAumentaCap(Object elemento) {
        // Verifica se a capacidade foi atingida
        if (this.topo + 1 >= this.elemento.length) {
            aumentarCapacidade();
        }
        this.elemento[++topo] = elemento;
        return true;
    }
	
	//verifica se é vazia
	public Boolean isEmpty() {
		return this.topo < 0;
	}
	
	//verifica o tamanho
	public int size() {
		return topo+1;
	}
	
	//retorna o topo
	public Object top(){
		if(!this.isEmpty()) {
			return this.elemento[this.topo];
		}
		return null;
	}
	
	//remove
	public Object pop() {
		if(!this.isEmpty()) {
			return this.elemento[this.topo--];
		}
		return null;
	}
	
	// Verifica se p1 tem mais elementos que p2
    public Boolean verificaP1P2(Pilha p1, Pilha p2) {
        return p1.size() > p2.size();
    }
    
    // Verifica se duas pilhas são iguais
    public Boolean pilhasIguais(Pilha p1, Pilha p2) {
        if (p1.size() != p2.size()) {
            return false;
        }
        for (int i = 0; i < p1.size(); i++) {
            if (!p1.elemento[i].equals(p2.elemento[i])) {
                return false; 
            }
        }
        return true; 
    }

    // Aumenta a capacidade da pilha
    private void aumentarCapacidade() {
        int novaCapacidade = this.elemento.length * 2;
        Object[] novoArray = new Object[novaCapacidade];
        for (int i = 0; i < this.elemento.length; i++) {
            novoArray[i] = this.elemento[i];
        }
        this.elemento = novoArray;
    }
	
    //duplica elementos da pilha
	public void duplicarElementos() {
    int tamanhoAtual = size();
    if (tamanhoAtual == 0) return;

    if (this.topo + tamanhoAtual >= this.elemento.length) {
        Object[] novoArray = new Object[this.elemento.length * 2];
        System.arraycopy(this.elemento, 0, novoArray, 0, this.elemento.length);
        this.elemento = novoArray;
    }

    for (int i = 0; i < tamanhoAtual; i++) {
        this.push(this.elemento[i]);
    	}
	}
	
	//remover elemento especifico
	public void removerElemento(Object elemento) {
    Pilha pilhaAuxiliar = new Pilha(this.size());

    while (!this.isEmpty()) {
        Object topoElemento = this.pop();
        if (!topoElemento.equals(elemento)) {
            pilhaAuxiliar.push(topoElemento);
        } else {
            break;
        }
    }

    while (!pilhaAuxiliar.isEmpty()) {
        this.push(pilhaAuxiliar.pop());
    	}
	}
	
	public void mostrarPilha() {
	    if (this.isEmpty()) {
	        System.out.println("A pilha está vazia.");
	        return;
	    }

	    System.out.println("Conteúdo da pilha (do topo para a base):");
	    for (int i = this.topo; i >= 0; i--) {
	        System.out.println(this.elemento[i]);
	    }
	}

	public Object[] getElemento() {
		return elemento;
	}

	public void setElemento(Object[] elemento) {
		this.elemento = elemento;
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}
}
