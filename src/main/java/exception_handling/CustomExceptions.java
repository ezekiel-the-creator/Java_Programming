package exception_handling;

public  class CustomExceptions {

    class MyCheckedException extends Exception{
        public MyCheckedException(String message){
            super(message);
        }
        
    }

    class MyUncheckedException extends RuntimeException{
        public MyUncheckedException(String message){
            super(message);
        }
    }
}
