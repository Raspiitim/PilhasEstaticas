
public class Main {

	public static void main(String[] args) {
		Pilha p1 = new Pilha(5);
		
		System.out.println("Tamanho da pilha: " + p1.size());
		System.out.println("Inserindo na pilha: " + p1.push(10));
		System.out.println("Inserindo na pilha: " + p1.push(20));
		System.out.println("Inserindo na pilha: " + p1.push(30));
		System.out.println("Topo da pilha: " + p1.top());
		System.out.println("Removendo o topo: " + p1.pop());
		System.out.println("Topo da pilha: " + p1.pop());
		System.out.println("Tamanho da pilha: " + p1.size());
		System.out.println("Topo da pilha: " + p1.top());
		
		
	}

}
