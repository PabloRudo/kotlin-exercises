interface IBankAccount {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
    fun checkBalance(): Double
}

class BasicBankAccount: IBankAccount {
    private var balance: Double = 0.0

    override fun deposit(amount: Double) {
        balance += amount
    }

    override fun withdraw(amount: Double) {
        balance -= amount
    }

    override fun checkBalance(): Double {
        return balance
    }
}

class PremiumBankAccount: IBankAccount {
    private var balance: Double = 0.0

    override fun deposit(amount: Double) {
        balance += amount * 1.1
    }

    override fun withdraw(amount: Double) {
        balance -= amount * 0.9
    }

    override fun checkBalance(): Double {
        return balance
    }
}

class BankAccount(account: IBankAccount): IBankAccount by account

fun main() {
    val basicAccount = BankAccount(BasicBankAccount())
    basicAccount.deposit(100.0)
    println(basicAccount.checkBalance())  // Prints 100.0
    basicAccount.withdraw(50.0)
    println(basicAccount.checkBalance())  // Prints 50.0

    val premiumAccount = BankAccount(PremiumBankAccount())
    premiumAccount.deposit(100.0)
    println(premiumAccount.checkBalance())  // Prints 110.0
    premiumAccount.withdraw(50.0)
    println(premiumAccount.checkBalance())  // Prints 45.0
}
