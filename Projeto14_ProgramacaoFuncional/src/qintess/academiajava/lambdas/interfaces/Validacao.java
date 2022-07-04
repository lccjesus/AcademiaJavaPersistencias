package qintess.academiajava.lambdas.interfaces;

@FunctionalInterface
public interface Validacao<T> {
	boolean validar(T item);
}
