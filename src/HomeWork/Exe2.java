package HomeWork;

public class HomeworkLesson2 {
    public static void main(String[] args) {

        String name = "     ПЕтРов Олег Иванович     ";
        System.out.println("ПЕтРов Олег Иванович");
        System.out.println(name.toUpperCase());
        int ind = name.indexOf("ова");
        int ind1 = name.indexOf("ов");
        if (ind != -1) {
            System.out.println("Уважаемая" + name.toUpperCase());

        } else if (ind1 != -1) {
            System.out.println("Уважаемый" + name.toUpperCase());

        } else System.out.println("неизвестное лицо");

        System.out.println("__________________________________");



        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (
                fuel < 10
                        ||  (!isWheelWork1 || isWheelWork2 || isWheelWork3 || isWheelWork4)
                        && hasErrors
                        || isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }

























            //Необходимо
            //1. убрать лишние пробелы,
            //2. перевести текст в верхний регистр
            //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
            // Если содержит "ов " то печатаем на экран: Уважаемый {name}
            // В иных случаях печатаем на экран: Неизвестное лицо {name}
        }


    }

