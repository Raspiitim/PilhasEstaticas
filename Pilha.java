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
