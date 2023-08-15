class CustomException extends Exception
{
	public CustomException() {
		super("CustomException caught");
	}

	public CustomException(String string) {
		super(string);
	}
}

public class Hey {
	public static void main(String[] args) throws CustomException {
		throw new CustomException();
//		throw new CustomException("Exception occurred");
	}
}
