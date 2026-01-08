fun main() {
    val kelAccount = Account("Kel")
    kelAccount.deposit(1000)
    kelAccount.withdraw(500)
    kelAccount.deposit(-20)
    kelAccount.withdraw(100)

    val balance = kelAccount.calculateBalance()
    println("Balance is $balance.")
//    kelAccount.balance = 1000
}

class Account(val accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (0 < amount) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        } else {
            println("Cannot deposit negative sums.")
        }
    }

    fun withdraw(withdrawal: Int) {
        if (0 > -withdrawal) {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal withdrawn. Balance is now ${this.balance}")
        } else {
            println("Cannot withdraw negative sums.")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}