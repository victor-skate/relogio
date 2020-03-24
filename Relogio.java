package relogio;

public class Relogio {
	protected int codigo;
	protected int hora;
	protected int minuto;
	
	
	
	public Relogio(int codigo, int hora, int minuto) {
		super();
		this.codigo = codigo;
		this.hora = 0;
		this.minuto =0;
	}

	public void adicionarHora() {
		this.hora +=1;
		if(hora>24){
			this.hora=00;
					}
	}
	
	public void adicionarMinuto(){
		this.minuto += 1;
		if (minuto > 59 && hora>=23){
			this.hora=00;
			this.minuto=00;
		}
		if(minuto > 59 && hora <= 23){
			this.hora+=1;
			this.minuto=00;
		}
	}
			
		
	
	public String consultar() {
		return "Relogio [codigo=" + codigo + ", hora=" + hora + ", minuto="
				+ minuto + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
		
	
}
