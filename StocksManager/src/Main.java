//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Portfolio portfolio = new Portfolio();
    Broker broker = new Broker();

    Command buyCommand1 = new BuyCommand(portfolio, "Tata", 123);
    broker.setCommand(buyCommand1);
    broker.execute();
    portfolio.print();

    Command buyCommand2 = new BuyCommand(portfolio, "Microsoft", 22);
    broker.setCommand(buyCommand2);
    broker.execute();
    portfolio.print();
}
