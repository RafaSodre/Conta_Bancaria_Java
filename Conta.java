public class Conta {

    private String numero;
    private double saldo;
    private double limite;
    private String status;

    public String getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getLimite(){
        return limite;
    }
    public String getStatus(){
        return status;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }







}
