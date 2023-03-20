//account that has variable id, owner, balance
//add acc add edit remove show
// account show information by :
// 1 . descending order by account_id
// 2.  ascending order by account_id
// 3. descender order by balance
public class Account {
    int id;
    String ownerName;
    double balance;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}