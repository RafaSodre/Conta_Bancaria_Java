public class App {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta();
        c1.setNumero("1");
        c1.setSaldo(0.0);
        c1.setLimite(500.0);
        c1.setStatus("cheque especial");

        var condicao = true;

        while (condicao) {
            
            String escolha = System.console().readLine("1-Saque\n2-Deposito\n3-Consutar saldo\n4-Cheque especial\n5-Fechar programa\n");

            switch (escolha) {
                case "1":
                    if (c1.getSaldo() > 0.0) {
                        double saque = Double.parseDouble(System.console().readLine("Seu saldo é: "+ c1.getSaldo() + "\nQuanto voce deseja sacar: "));
                        if (saque <= c1.getSaldo()) {
                            c1.setSaldo(c1.getSaldo()-saque);
                            System.out.println("Operação concluida, seu saldo agora é de: " + c1.getSaldo());
                            System.out.println("________________________________");
                        }else{
                            System.out.println("voce nao possui esse valor na conta");
                            System.out.println("________________________________");
                        }
                    }else{
                        System.out.println("Saldo insuficiente");
                        System.out.println("________________________________");
                    }
                    break;
                case "2":

                    double deposito = Double.parseDouble(System.console().readLine("Seu saldo é: "+ c1.getSaldo() + "\nQuanto voce deseja depositar: "));
                    c1.setSaldo(deposito + c1.getSaldo());
                    System.out.println("Operação concluida, seu saldo agora é de: " + c1.getSaldo());
                    System.out.println("________________________________");
                    break;

                case "3":
                    System.out.println("Seu saldo é de: " + c1.getSaldo());
                    System.out.println("________________________________");
                    break;
                case "4":
                    if (c1.getStatus().equals("cheque especial")) {
                        
                        if(c1.getLimite() <= 0){
                        System.out.println("voce nao possui saldo no cheque especial");
                        System.out.println("________________________________");
                        }else{
                        System.out.println("Sua conta possui cheque especial");
                        System.out.println("Seu limite é de " + c1.getLimite());
                        double especial = Double.parseDouble(System.console().readLine("Quanto voce deseja sacar do cheque especial: "));
                        if (especial <= c1.getLimite()) {
                            c1.setLimite(c1.getLimite()-especial);
                            System.out.println("Seu limite agora é de " + c1.getLimite());
                        }else{
                            System.out.println("valor inválido");
                        }

                        }
                    }
                    break;
                case "5":
                    System.out.println("Programa Finalizado");
                    condicao = false;
                    break;
                default:
                    System.out.println("Digite um caractere válido");
                    System.out.println("________________________________");
                    break;
            }
        }
    }
}





