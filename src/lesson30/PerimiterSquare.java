package lesson30;

public class PerimiterSquare {
    public void getPerimiter(String str) throws PerimiterException {
        Square square = new Square();
        try {
            double side = Double.parseDouble(str);// парсинг строки // т.е преобразование к double
            square.setSide(side);
        } catch (NumberFormatException ex) {
            throw new PerimiterException("String inccorect",ex);
        } catch (PerimiterException e) {
            System.err.println(e.getMessage());
        }
    }
}
