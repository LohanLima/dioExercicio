package CarroE;

public class Carro {
/* tentei por inpput */

    public int quant_no_carro = 0;
    boolean alterar = true;

    public int AddeRemo() {
        if (quant_no_carro <= 5 && alterar == true) {
            quant_no_carro += 1;
            System.out.println("Adicinou uma pessoa no carro");
            System.out.println("Pode entrar mais pessoas");
        } else if (quant_no_carro >= 0 && alterar == false) {
            quant_no_carro -= 1;
            System.out.println("Removeu uma pessoa do carro");
            System.out.println("Pode sair mais pessoas.");
        } else if (quant_no_carro < 0 && alterar == false) {
            System.out.println("Não há pessoas no carro para retirar");
        } else {
            System.out.println("O carro atingiu a capacidade maxima");
        }
        return quant_no_carro;
    }

    public int pessoa_no_carro = AddeRemo();
    public String mostrandoQuant(){
        return "há " +pessoa_no_carro+ " pessoas no carro.";
    }
}

