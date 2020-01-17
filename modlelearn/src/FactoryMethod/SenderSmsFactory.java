package FactoryMethod;

public class SenderSmsFactory implements IProvider{

	@Override
	public ISender provider() {
		// TODO Auto-generated method stub
		return new SenderSms();
	}
	
}
