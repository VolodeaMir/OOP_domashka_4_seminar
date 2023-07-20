public class Calculator<T extends Number> {

    public T sum(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемые типы для сложения");
        }
    }

    public T multiply(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемые типы для умножения");
        }
    }

    public T divide(T a, T b) {
        if (b.doubleValue() == 0.0) {
            throw new IllegalArgumentException("Деление на ноль не допускается");
        }

        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемые типы для деления");
        }
    }

    public String toBinary(T value) {
        if (value instanceof Integer) {
            return Integer.toBinaryString(value.intValue());
        } else if (value instanceof Double) {

            int intValue = (int) Math.round(value.doubleValue());
            return Integer.toBinaryString(intValue);
        } else if (value instanceof Float) {

            int intValue = Math.round(value.floatValue());
            return Integer.toBinaryString(intValue);
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип для двоичного преобразования");
        }
    }
}
