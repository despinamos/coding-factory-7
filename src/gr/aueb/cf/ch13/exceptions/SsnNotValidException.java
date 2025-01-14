package gr.aueb.cf.ch13.exceptions;

public class SsnNotValidException extends RuntimeException {
  public SsnNotValidException(String message) {
    super(message);
  }
}
