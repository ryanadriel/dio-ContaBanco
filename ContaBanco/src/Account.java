public class Account {
  private String name;           // Armazena o nome do cliente
  private int accountNumber;     // Armazena o número da conta
  private int agency;            // Armazena o número da agência 
  private double balanceInitial; // Armazena o saldo inicial da conta 

  /**
 * Construtor da classe Account.
 * 
 * @param name           Nome do cliente.
 * @param accountNumber  Número da conta.
 * @param agency         Número da agência.
 * @param balanceInitial Saldo inicial da conta.
 */
  public Account(String name, int accountNumber, int agency, double balanceInitial) {
    this.name = name;                     
    this.accountNumber = accountNumber;   
    this.agency = agency;                 
    this.balanceInitial = balanceInitial; 
  }

  public int getAccountNumber() {
    return accountNumber; // Retorna o número da conta
  }

  public double getBalance() {
    return balanceInitial; // Retorna o saldo inicial da conta
  }
}
