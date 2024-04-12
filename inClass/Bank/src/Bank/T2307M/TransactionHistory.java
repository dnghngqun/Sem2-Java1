package Bank.T2307M;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {

    private long id;
    private LocalDate dayTrading;
    private String description;
    private String beneficiaryAccount;
    private long money;

    public TransactionHistory(String description, String beneficiaryAccount, long money) {
        this.id = IdGenerate.getNewID();
        this.dayTrading = LocalDate.now();
        this.description = description;
        this.beneficiaryAccount = beneficiaryAccount;
        this.money = money;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDayTrading(LocalDate dayTrading) {
        this.dayTrading = dayTrading;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDayTrading() {
        return dayTrading;
    }

    public String getDescription() {
        return description;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public String toString() {
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format(id + " - " + dayTrading.format(myFormatter) + " - " + description + " - " + Controller.formatMoney(money) + " - " + beneficiaryAccount + "\n");
    }
}
