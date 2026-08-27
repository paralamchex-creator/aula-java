public class LogicaBasica {
    public static void main(String[] args) {
        int nota=75;
        //if else
        if (nota==100) {
            System.out.println("aprovado");
        } else if (nota > 70){
            System.out.println("recuperação");
        } else {
            System.out.println("reprovado");
        }

        //array
        String[] cores={"preto", "branco",  "vermelho"};
        System.out.println(cores.length);
        System.out.println("cores: "+cores);

        //for
        for(int i=0;i< cores.length;i++){
            System.out.println("cor: "+cores[i]);
        }

        //while
        String[] times={"corinthians","mirassol",  "brusque"};
        int contador=0;
        while(contador< times.length){
            System.out.println("time"+(contador+1)+": "+times[contador]);
            contador++;
        }

        //switch case
        String mensagem= switch (nota){
            case 100 -> "aprovado";
            case 70 -> "recuperação";
            default -> "reprovado";
        };
        System.out.println(mensagem);
    }
}
