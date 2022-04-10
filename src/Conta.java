

public class Conta {
	
	
  private  double saldo;
    int agencia;
    int numero;
    //titular da conta
    Cliente titular;
   
    

    public void deposita (double valor) {
    	this.saldo=this.saldo+valor;
    	
    }
    
    public boolean sacar(double valor) {
    	
    	if(saldo>=valor) {
    	this.saldo=this.saldo-valor;
    	return true;
    }  
    	else {
        return false;
    	}
}
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo>=valor) {
    		this.saldo-=valor;
    		destino.deposita(valor);
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    //metodo que devolve e informa o saldo
    
    public double getSaldo() {
    	return this.saldo;
    }
    
   
}
