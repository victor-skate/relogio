package relogio;

public class Principal {
	static Relogio[] relogios = new Relogio[10];
	
	public static void incluir(){
		int codigo = Teclado.lerInt("codigo:");
		int hora = Teclado.lerInt("hora:");
		
			while(hora>23){
				hora = Teclado.lerInt("Hora deve ser menor que 24. Digite novamente:");
			}
		
		int minuto = Teclado.lerInt("minuto:");
			
			while(minuto > 59){
				minuto = Teclado.lerInt("Minuto deve ser menor que 60.Digite novamente:");
			}
		
		Relogio relogio= new Relogio(codigo,hora,minuto);
		
		for (int i = 0; i < relogios.length;i++){
			if (relogios[i]==null){
				relogios[i]= relogio;
				break;
			}
		}
	menu();
	}
	
	public static void adicionarHora(){
		
		int codigo = Teclado.lerInt("codigo do relogio:");
		for (int i = 0; i < relogios.length;i++){
			if (relogios[i]!=null && relogios[i].getCodigo()==codigo){
				relogios[i].adicionarHora();
				break;
			}
		}
		System.out.println("sucess");
	menu();
	}

	public static void adicionarMinuto(){
		int codigo = Teclado.lerInt("codigo do relogio:");
		for (int i = 0; i < relogios.length;i++){
			if (relogios[i]!=null && relogios[i].getCodigo()==codigo){
				relogios[i].adicionarMinuto();
				break;
			}
		}
		System.out.println("sucess");
	menu();
	}
	
	public static void consultar(){
		for (int i = 0; i < relogios.length;i++){
			if(relogios[i]!=null){
				System.out.println(relogios[i].consultar());
			}
		}
	menu();
	}
	
	public static void main (String[]args){
		menu();
	}

	private static void menu() {
		int op = Teclado.lerInt("(1)incluir (2)adicionar hora (3)adicionar minuto (4)consultar:");
	
			switch (op){
			case 1:
				incluir();
				break;
				
			case 2:
				adicionarHora();
				break;
			
			case 3:
				adicionarMinuto();
				break;
			
			case 4:
				consultar();
				break;
			
			default:
				menu();
			}
	
	}
	
}