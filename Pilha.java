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
