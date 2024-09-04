package Enum;

public class PrincipalPedido {

	public static void main(String[] args) {
		StatusPedido status = StatusPedido.aberto;
		StatusPedido status1 = StatusPedido.em_andamento;
		StatusPedido status2 = StatusPedido.entregue;	
		StatusPedido status3 = StatusPedido.cancelado;
		
		System.out.println(status);
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
	
	}

}
