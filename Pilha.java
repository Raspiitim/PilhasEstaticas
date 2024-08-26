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

	public void duplicarElementos() {
    int tamanhoAtual = size();
    if (tamanhoAtual == 0) return; // Se a pilha está vazia, nada a duplicar.

    // Aumentar a capacidade se necessário
    if (this.topo + tamanhoAtual >= this.elemento.length) {
        Object[] novoArray = new Object[this.elemento.length * 2];
        System.arraycopy(this.elemento, 0, novoArray, 0, this.elemento.length);
        this.elemento = novoArray;
    }

    // Duplicar os elementos
    for (int i = 0; i < tamanhoAtual; i++) {
        this.push(this.elemento[i]);
    }
}
	public void inverterPilha() {
    PilhaEstatica pilhaAuxiliar = new PilhaEstatica(this.size());

    // Desempilhar todos os elementos na pilha auxiliar
    while (!this.isEmpty()) {
        pilhaAuxiliar.push(this.pop());
    }

    // Copiar de volta para a pilha original
    while (!pilhaAuxiliar.isEmpty()) {
        this.push(pilhaAuxiliar.pop());
    }
}
	public void removerElemento(Object elemento) {
    PilhaEstatica pilhaAuxiliar = new PilhaEstatica(this.size());

    // Transferir elementos para a pilha auxiliar até encontrar o elemento a remover
    while (!this.isEmpty()) {
        Object topoElemento = this.pop();
        if (!topoElemento.equals(elemento)) {
            pilhaAuxiliar.push(topoElemento);
        } else {
            break; // Remove apenas a primeira ocorrência
        }
    }

    // Transferir de volta para a pilha original
    while (!pilhaAuxiliar.isEmpty()) {
        this.push(pilhaAuxiliar.pop());
    }
}
	public void mesclarPilhas(PilhaEstatica outraPilha) {
    PilhaEstatica pilhaAuxiliar = new PilhaEstatica(outraPilha.size());

    // Transferir elementos de outraPilha para a pilha auxiliar (invertendo a ordem)
    while (!outraPilha.isEmpty()) {
        pilhaAuxiliar.push(outraPilha.pop());
    }

    // Adicionar elementos da pilha auxiliar ao topo da pilha atual
    while (!pilhaAuxiliar.isEmpty()) {
        this.push(pilhaAuxiliar.pop());
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
