package creations;

public class Transaction {
    /**
     * Clase que define la estructura y getters de una transaccion
     */
    private final int transactionId;
    private final String transactionType;
    private final double ammount;

    public Transaction(int transactionId, String transactionType, double ammount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.ammount = ammount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmmount() {
        return ammount;
    }
}
