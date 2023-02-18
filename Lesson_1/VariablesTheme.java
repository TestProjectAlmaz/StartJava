public class VariablesTheme {    
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных в консоль:\n");    
        byte opersistem = 64;
        short modelNumber = 6523;
        int productCode = 00322156;
        long deviceCode = 96830228;
        float ram = 6.00f;
        double model = 1308.4129954d;
        boolean logicType = ram == 6.00f;
        char processor = 'R';

        System.out.println(" Тип операционной системы: " + "byte = " + opersistem + "\n" +
                " Номер модели: " + "short = " + modelNumber + "\n" +
                " Код продукта: " + "int = " + productCode + "\n" +
                " Код устройства: " + "long = " + deviceCode + "\n" +
                " Оперативная память: " + "float = " + ram + "\n" +
                " Модель: " + "double = " + model + "\n" +
                " ОЗУ: " + "boolean = " + logicType + "\n" +
                " Процессор: " + "char = " + processor + "\n");
        
        System.out.println("2. Расчет стоимости товара со скидкой:\n");
        int pricePen = 100;
        int priceBook = 200;
        int sumGoods = pricePen + priceBook;
        int sumPercent = sumGoods * 11 / 100;
        int discountPrice = sumGoods - sumPercent;

        System.out.println("Стоимость товаров без скидки: " + sumGoods + " рублей.");
        System.out.println("Сумма скидки на товар: " + sumPercent + " рубля.");
        System.out.println("Общая сумма товаров со скидкой: " + discountPrice + " рублей.\n");       

        System.out.println("3. Вывод слова JAVA:\n ");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a \n ");
        
        System.out.println("4. Вывод min и max значений целых числовых типов:\n");
        byte byteMax = 127;
        System.out.println("Исходное значение числового типа byte = " + byteMax);
        byteMax++;
        System.out.println("Значение после инкремента = " + byteMax);
        byteMax--;
        System.out.println("Значение после декремента = " + byteMax + "\n ");

        short shortMax = 32767;
        System.out.println("Исходное значение числового типа short = " + shortMax);
        shortMax++;
        System.out.println("Значение после инкремента = " + shortMax);
        shortMax--;
        System.out.println("Значение после декремента = " + shortMax + "\n ");

        int intMax = 2147483647;
        System.out.println("Исходное значение числового типа int = " + intMax);
        intMax++;
        System.out.println("Значение после инкремента = " + intMax);
        intMax--;
        System.out.println("Значение после декремента = " + intMax + "\n ");

        Long longMax = 9223372036854775807L;
        System.out.println("Исходное значение числового типа Long = " + longMax);
        longMax++;
        System.out.println("Значение после инкремента = " + longMax);
        longMax--;
        System.out.println("Значение после декремента = " + longMax + "\n ");
        
        System.out.println("5. Перестановка значений переменных:\n");
        int number1 = 2;
        int number2 = 5;
        int temp = number1;

        //с помощью третьей переменной
        number1 = number2;
        number2 = temp;

        System.out.println("Перестановка с помощью третьей переменной:\n" +
                " исходное значение = " + temp + "\n " + " новое значение = " + number1 +
                "\n\n " + " исходное значение = " + number1 + "\n " +
                " новое значение = " + number2 + "\n ");

        //с помощью арифметических операций
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;

        System.out.println("Перестановка с помощью арифметических операций:\n" +
                " исходное значение = " + number1 + "\n " + " новое значение = " +
                number2 + "\n\n " + " исходное значение = " + number2 +
                "\n " + " новое значение = " + number1 + "\n ");

        //с помощью побитовой операции ^
        number1 ^= number2;
        number2 = number1 ^ number2;
        number1 ^= number2;

        System.out.println("Перестановка с помощью побитовой операции:\n" +
                " исходное значение = " + number2 + "\n " + " новое значение = " +
                number1 + "\n\n " + " исходное значение = " + number1 +
                "\n " + " новое значение = " + number2 + "\n ");
        
        System.out.println("6. Вывод символов и их кодов:\n ");
        char hash = '#';   
        char ampersand = '&';    
        char commercialA = '@';    
        char caret = '^';   
        char underscore1 = '_';    

        System.out.println(hash + " = " + (int)hash + "\n" + ampersand + " = " +
                (int)ampersand + "\n" + commercialA + " = " + (int)commercialA + "\n" +
                caret + " = " + (int)caret + "\n" + underscore1 + " = " + (int)underscore1 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка:\n ");
        char backslash = '\\';
        char slash = '/';
        char bracket = '(';
        char backbracket = ')';
        char underscore = '_';

        System.out.println("      " + slash + backslash + "\n" + "     " + slash +
                "  " + backslash + "\n " + "   " + slash + underscore + bracket +
                " " + backbracket + backslash + "\n " + "  " + slash + "    " +
                "  " + backslash + "\n" + "  " + slash + underscore + underscore +
                underscore + underscore + slash + slash + underscore + underscore +
                backslash + "\n ");
        
        System.out.println("8. Вывод количества сотен, десятков и единиц числа:\n ");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        System.out.println("Число " + number + "  содержит:\n " + "  " + hundreds + " = " +
                "сотню\n " + "  " + tens + " = " + "десятки\n " + "  " + ones + " = " + "единицы\n ");
        
        System.out.println("9. Вывод времени:\n ");
        int seconds = 86399;
        long hour = (seconds / 60) / 60;
        int min = (seconds / 60) % 60;
        int sec = seconds % 60;
        System.out.println(hour + ":" + min + ":" + sec);
        }

       }

        
