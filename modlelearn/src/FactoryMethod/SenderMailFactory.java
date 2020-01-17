package FactoryMethod;

public class SenderMailFactory implements IProvider {

	@Override
	public ISender provider() {
		return new SenderMail();

	}

}
