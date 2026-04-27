class TryCatch {
    public static void main() {
        divide(10, 0);
        divide(12,4);
        IO.println("Done.");
    }

    static void divide(int a, int b) {
        String errorMassage = null;

        try {
            int result = a / b;
            IO.println(result);
        }
        catch(Throwable e) {
            IO.println("Exception!");
            errorMassage = e.getMessage();
        }
        finally {
            if(errorMassage != null){
                IO.println("error: ");
                IO.println(errorMassage);

            }
            else {
                IO.println("Exception not found!");
            }
        }
    }
}