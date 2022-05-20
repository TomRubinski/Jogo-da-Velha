import java.util.Random;
import java.util.Scanner;

public class principal {
    public static String simbolo() {
        Scanner ler = new Scanner(System.in);
        int simbolo = 0;
        String XisOuBolinha="O";
        do {
            System.out.println("Jogador 1, escolha o simbolo de jogo:");
            System.out.println("1 - X");
            System.out.println("2 - O \n");
            simbolo = ler.nextInt();
        } while (simbolo > 2 || simbolo < 1);
        if (simbolo == 1) {
            XisOuBolinha = "X";
        } else if (simbolo == 2) {
            XisOuBolinha = "O";
        }
        return XisOuBolinha;
    }
    public static String[][] caixaVazia (){
        String [][] caixaVazia = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        return caixaVazia;
    }
    public static String mostraMapa(String[][] caixaVazia){
        String retorno ="";
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                retorno+=caixaVazia[l][c]+"   ";

            }
            retorno+="\n\n";
        }
        return retorno;
    }
    public static Boolean verificaVencedor (String[][] caixaVazia){
        Boolean retorno = false;
        if (caixaVazia[0][0].equals("X") && caixaVazia[0][1].equals("X") && caixaVazia[0][2].equals("X")){
            retorno = true;
        } else if (caixaVazia[1][0].equals("X") && caixaVazia[1][1].equals("X") && caixaVazia[1][2].equals("X")) {
            retorno = true;
        } else if (caixaVazia[2][0].equals("X") && caixaVazia[2][1].equals("X") && caixaVazia[2][2].equals("X")) {
            retorno = true;
        } else if (caixaVazia[0][0].equals("X") && caixaVazia[1][0].equals("X") && caixaVazia[2][0].equals("X")) {
            retorno = true;
        } else if (caixaVazia[0][1].equals("X") && caixaVazia[1][1].equals("X") && caixaVazia[2][1].equals("X")) {
            retorno = true;
        } else if (caixaVazia[0][2].equals("X") && caixaVazia[1][2].equals("X") && caixaVazia[2][2].equals("X")) {
            retorno = true;
        } else if (caixaVazia[2][0].equals("X") && caixaVazia[1][1].equals("X") && caixaVazia[0][2].equals("X")) {
            retorno = true;
        } else if (caixaVazia[0][0].equals("X") && caixaVazia[1][1].equals("X") && caixaVazia[2][2].equals("X")) {
            retorno = true;
        }
        if (caixaVazia[0][0].equals("O") && caixaVazia[0][1].equals("O") && caixaVazia[0][2].equals("O")){
            retorno = true;
        } else if (caixaVazia[1][0].equals("O") && caixaVazia[1][1].equals("O") && caixaVazia[1][2].equals("O")) {
            retorno = true;
        } else if (caixaVazia[2][0].equals("O") && caixaVazia[2][1].equals("O") && caixaVazia[2][2].equals("O")) {
            retorno = true;
        } else if (caixaVazia[0][0].equals("O") && caixaVazia[1][0].equals("O") && caixaVazia[2][0].equals("O")) {
            retorno = true;
        } else if (caixaVazia[0][1].equals("O") && caixaVazia[1][1].equals("O") && caixaVazia[2][1].equals("O")) {
            retorno = true;
        } else if (caixaVazia[0][2].equals("O") && caixaVazia[1][2].equals("O") && caixaVazia[2][2].equals("O")) {
            retorno = true;
        } else if (caixaVazia[2][0].equals("O") && caixaVazia[1][1].equals("O") && caixaVazia[0][2].equals("O")) {
            retorno = true;
        } else if (caixaVazia[0][0].equals("O") && caixaVazia[1][1].equals("O") && caixaVazia[2][2].equals("O")) {
            retorno = true;
        }
        return retorno;
    }
    public static Boolean verificaVelha (String[][] caixaVazia){
        Boolean retorno = false;
        if (caixaVazia[0][0]!="1" && caixaVazia[0][1]!="2" && caixaVazia[0][2]!="3"
                && caixaVazia[1][0]!="4" && caixaVazia[1][1]!="5" && caixaVazia[1][2]!="6" && caixaVazia[2][0]!="7"
                && caixaVazia[2][1]!="8" && caixaVazia[2][2]!="9"){
            retorno = true;
        }
        return retorno;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int modoDeJogo;
        String nomeJogadorX;
        String nomeJogadorY;
        do {
            System.out.println("Escolha o modo de jogo:");
            System.out.println("1 - Jogador x CPU");
            System.out.println("2 - Jogador x Jogador \n");
            modoDeJogo = ler.nextInt();
        } while (modoDeJogo>2 || modoDeJogo<1);
        if(modoDeJogo==1) {
            System.out.println("Jogador 1, escreva seu nome:");
            nomeJogadorX = ler.next();
            String simboloJogador = simbolo();
            String simboloCPU = "0";
            if (simboloJogador == "X") {
                simboloCPU = "O";
            } else {
                simboloCPU = "X";
            }
            String[][] caixaVazia = caixaVazia();
            for (int i = 0; i<9; i++){
                System.out.println( "Escolha uma posição para sua jogada, "+nomeJogadorX+ ". Escolha a posição pelo número abaixo.");
                System.out.println(mostraMapa(caixaVazia));
                int posicao = ler.nextInt();

                if (posicao == 1 && !caixaVazia[0][0].equals("X") && !caixaVazia[0][0].equals("O")) {
                    caixaVazia[0][0] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 2 && !caixaVazia[0][1].equals("X") && !caixaVazia[0][1].equals("O")) {
                    caixaVazia[0][1] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 3 && !caixaVazia[0][2].equals("X") && !caixaVazia[0][2].equals("O")) {
                    caixaVazia[0][2] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 4 && !caixaVazia[1][0].equals("X") && !caixaVazia[1][0].equals("O")) {
                    caixaVazia[1][0] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 5 && !caixaVazia[1][1].equals("X") && !caixaVazia[1][1].equals("O")) {
                    caixaVazia[1][1] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 6 && !caixaVazia[1][2].equals("X") && !caixaVazia[1][2].equals("O")) {
                    caixaVazia[1][2] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 7 && !caixaVazia[2][0].equals("X") && !caixaVazia[2][0].equals("O")) {
                    caixaVazia[2][0] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 8 && !caixaVazia[2][1].equals("X") && !caixaVazia[2][1].equals("O")) {
                    caixaVazia[2][1] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 9 && !caixaVazia[2][2].equals("X") && !caixaVazia[2][2].equals("O")) {
                    caixaVazia[2][2] = simboloJogador;
                    System.out.println(mostraMapa(caixaVazia));
                }
                else {
                    System.out.println("Jogada inválida! Perdeu a vez "+nomeJogadorX+".");
                }
                if (verificaVencedor(caixaVazia)){
                    System.out.println("Parabéns jogador! Você venceu!");
                    break;
                }
                if (verificaVelha(caixaVazia)){
                    System.out.println("O jogo acabou em empate!");
                    break;
                }

                Random aleatorio = new Random();
                boolean cpuJogou = false;
                do {
                    int jogadaCPU = aleatorio.nextInt(9) + 1;

                    if (jogadaCPU == 1 && !caixaVazia[0][0].equals("X") && !caixaVazia[0][0].equals("O")) {
                        caixaVazia[0][0] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 2 && !caixaVazia[0][1].equals("X") && !caixaVazia[0][1].equals("O")) {
                        caixaVazia[0][1] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 3 && !caixaVazia[0][2].equals("X") && !caixaVazia[0][2].equals("O")) {
                        caixaVazia[0][2] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 4 && !caixaVazia[1][0].equals("X") && !caixaVazia[1][0].equals("O")) {
                        caixaVazia[1][0] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 5 && !caixaVazia[1][1].equals("X") && !caixaVazia[1][1].equals("O")) {
                        caixaVazia[1][1] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 6 && !caixaVazia[1][2].equals("X") && !caixaVazia[1][2].equals("O")) {
                        caixaVazia[1][2] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 7 && !caixaVazia[2][0].equals("X") && !caixaVazia[2][0].equals("O")) {
                        caixaVazia[2][0] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 8 && !caixaVazia[2][1].equals("X") && !caixaVazia[2][1].equals("O")) {
                        caixaVazia[2][1] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                        cpuJogou = true;
                    } else if (jogadaCPU == 9 && !caixaVazia[2][2].equals("X") && !caixaVazia[2][2].equals("O")) {
                        caixaVazia[2][2] = simboloCPU;
                        System.out.println(mostraMapa(caixaVazia));
                    }
                }
                while(cpuJogou==false);

                if (verificaVencedor(caixaVazia)){
                    System.out.println("Você perdeeu!");
                    break;
                }
                if (verificaVelha(caixaVazia)){
                    System.out.println("O jogo acabou em empate!");
                    break;
                }
                }


        }
            else if (modoDeJogo==2) {
            System.out.println("Jogador 1, escreva seu nome:");
            nomeJogadorX = ler.next();
            System.out.println("Jogador 2, escreva seu nome:");
            nomeJogadorY = ler.next();
            String nomeJogador1 = "";
            String nomeJogador2 = "";
            Random aleatorio = new Random();
            int quemJoga = aleatorio.nextInt(2) + 1;
            if (quemJoga==1){
                nomeJogador1 = nomeJogadorX;
                nomeJogador2 = nomeJogadorY;
                System.out.println(nomeJogador1+", você começa jogando, você é o Jogador 1.");
            } else if (quemJoga==2) {
                nomeJogador1 = nomeJogadorY;
                nomeJogador2 = nomeJogadorX;
                System.out.println(nomeJogador1+", você começa jogando, você é o Jogador 1.");
            }
            String simboloJogador1 = simbolo();
            String simboloJogador2 = "0";
            if(simboloJogador1=="X"){
                simboloJogador2 = "O";
            } else{simboloJogador2="X";}
            String[][] caixaVazia = caixaVazia();
            for (int i = 0; i<9; i++){
                System.out.println("Escolha uma posição para sua jogada, "+nomeJogador1+". Escolha a posição pelo número abaixo.");
                System.out.println(mostraMapa(caixaVazia));
                int posicao = ler.nextInt();

                if (posicao == 1 && !caixaVazia[0][0].equals("X") && !caixaVazia[0][0].equals("O")) {
                    caixaVazia[0][0] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 2 && !caixaVazia[0][1].equals("X") && !caixaVazia[0][1].equals("O")) {
                    caixaVazia[0][1] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 3 && !caixaVazia[0][2].equals("X") && !caixaVazia[0][2].equals("O")) {
                    caixaVazia[0][2] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 4 && !caixaVazia[1][0].equals("X") && !caixaVazia[1][0].equals("O")) {
                    caixaVazia[1][0] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 5 && !caixaVazia[1][1].equals("X") && !caixaVazia[1][1].equals("O")) {
                    caixaVazia[1][1] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 6 && !caixaVazia[1][2].equals("X") && !caixaVazia[1][2].equals("O")) {
                    caixaVazia[1][2] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 7 && !caixaVazia[2][0].equals("X") && !caixaVazia[2][0].equals("O")) {
                    caixaVazia[2][0] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 8 && !caixaVazia[2][1].equals("X") && !caixaVazia[2][1].equals("O")) {
                    caixaVazia[2][1] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao == 9 && !caixaVazia[2][2].equals("X") && !caixaVazia[2][2].equals("O")) {
                    caixaVazia[2][2] = simboloJogador1;
                    System.out.println(mostraMapa(caixaVazia));
                }
                else {
                    System.out.println("Jogada inválida! Perdeu a vez "+nomeJogador1+".");
                }
                if (verificaVencedor(caixaVazia)){
                    System.out.println("Parabéns "+nomeJogador1+"! Você venceu!");
                    break;
                }
                if (verificaVelha(caixaVazia)){
                    System.out.println("O jogo acabou em empate!");
                    break;
                }

                System.out.println("Escolha uma posição para sua jogada, "+nomeJogador2+". Escolha a posição pelo número abaixo.");
                System.out.println(mostraMapa(caixaVazia));
                int posicao2 = ler.nextInt();

                if (posicao2 == 1 && !caixaVazia[0][0].equals("X") && !caixaVazia[0][0].equals("O")) {
                    caixaVazia[0][0] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 2 && !caixaVazia[0][1].equals("X") && !caixaVazia[0][1].equals("O")) {
                    caixaVazia[0][1] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 3 && !caixaVazia[0][2].equals("X") && !caixaVazia[0][2].equals("O")) {
                    caixaVazia[0][2] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 4 && !caixaVazia[1][0].equals("X") && !caixaVazia[1][0].equals("O")) {
                    caixaVazia[1][0] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 5 && !caixaVazia[1][1].equals("X") && !caixaVazia[1][1].equals("O")) {
                    caixaVazia[1][1] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 6 && !caixaVazia[1][2].equals("X") && !caixaVazia[1][2].equals("O")) {
                    caixaVazia[1][2] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 7 && !caixaVazia[2][0].equals("X") && !caixaVazia[2][0].equals("O")) {
                    caixaVazia[2][0] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 8 && !caixaVazia[2][1].equals("X") && !caixaVazia[2][1].equals("O")) {
                    caixaVazia[2][1] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                } else if (posicao2 == 9 && !caixaVazia[2][2].equals("X") && !caixaVazia[2][2].equals("O")) {
                    caixaVazia[2][2] = simboloJogador2;
                    System.out.println(mostraMapa(caixaVazia));
                }
                else {
                    System.out.println("Jogada inválida! Perdeu a vez "+nomeJogador2+".");
                }
                if (verificaVencedor(caixaVazia)){
                    System.out.println("Parabéns "+nomeJogador2+"! Você venceu!");
                    break;
                }
                if (verificaVelha(caixaVazia)){
                    System.out.println("O jogo acabou em empate!");
                    break;
                }

        }
    }
}
}
