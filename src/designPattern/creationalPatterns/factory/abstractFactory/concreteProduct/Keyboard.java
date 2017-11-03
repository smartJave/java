package designPattern.creationalPatterns.factory.abstractFactory.concreteProduct;

import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.AbstractPeripheralProduct;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;

public class Keyboard extends AbstractPeripheralProduct implements InputAble{

	@Override
	public void input() {
		System.out.println("This is a keyboard. Made In " + getMadeIn());
	}
	
}