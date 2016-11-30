package controle;

public class Carrinho {
	String[] itens;
	int indice;
	
public String[] getItens() { 
	return itens; 
}
public void setItens(String[] itens) {
	this.itens = itens;
}
public int getIndice() { 
	return indice; 
}
public void setIndice(int indice) {
	this.indice = indice;
}
public Carrinho() {
	
	itens = new String[10];
	indice = 0; 
}
void adiciona(String id) {
	itens[indice] = id;
	indice++; 
}

void excluir(String id) {
	itens[indice] = id;
	indice--; 
}

}