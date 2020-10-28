package metodosRevisao;

public class ExecutaMetodos {

	public static void main(String[] args) {

		Revisao revisao = new Revisao();

		revisao.mensagem();
		revisao.digiteSuaMensagem("Estudando metodos");
		System.out.println(revisao.calcular(3, 4));
		System.out.println(revisao.numeroCpf(12345677));

	}

}
