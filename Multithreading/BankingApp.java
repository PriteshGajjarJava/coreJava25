class BankingApp {
    public static void main(String[] args) {
        Account a1 = new Account(123, 10000);
        Account a2 = new Account(456, 7000);

        // a1 -> deposit
        // a2 -> withdrawl
        TransactionThread t1 = new TransactionThread(a1, OperationType.DEPOSIT, 5000);
        TransactionThread t2 = new TransactionThread(a1, OperationType.WITHDRAWL, 2000);
        t1.start();
        t2.start();
    }
}

enum OperationType { WITHDRAWL, DEPOSIT }

class TransactionThread extends Thread {
    Account act;
    float amt;
    OperationType op;
    TransactionThread(Account act, OperationType op, float amt) {
        this.act = act;
        this.op = op;
        this.amt = amt;
    }
    public void run() {
        switch(this.op) {
            case WITHDRAWL:
                this.act.withdrawl(this.amt);    
                break;
            case DEPOSIT:
                this.act.deposit(this.amt);
                break;
        }
    }
}

class Account {
  int actNo;
  float bal;

  Account(int actNo, float bal) { this.actNo = actNo; this.bal = bal; }

  // Write operation
  synchronized void withdrawl(float amt) {
    System.out.println(this.actNo + ": Before withdrawl your balance is: " + this.bal);
    if (amt > this.bal) {
        System.out.println("Invalid withdrawl amount");
        return;
    }
    this.bal -= amt;
    System.out.println(this.actNo + ": After withdrawl new balance is:" + this.bal);
  }

  synchronized void deposit(float amt) {
    System.out.println(this.actNo + ": Before deposit your balance is: " + this.bal);
    if (amt < 0) {
        System.out.println("Invalid deposit amount");
        return;
    }
    this.bal += amt;
    System.out.println(this.actNo + ": After deposit new balance is:" + this.bal);
  }

  // Read operation
  float getBalance() {
    return this.bal;
  }
}
