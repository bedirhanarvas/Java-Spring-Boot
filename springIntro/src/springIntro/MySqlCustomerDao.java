package springIntro;

public class MySqlCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("MySQL ile eklendi");
	}

}
