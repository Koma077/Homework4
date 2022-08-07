public class Main {
    public static void main(String[] args){
        //Задача 1
        int clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //Задача 2
        int clientDeviceYear = 2007;
        if (clientDeviceYear > 2015){
            System.out.println("Приложение подходит для данной версии телефона IOS");
        }else{
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        //Задаа 3
        int year = 2022;
        if (year % 4 == 0){
            System.out.println(year + " это високосный год");
        }else if ((year % 4 == 0)&&(year % 100 == 0)){
            System.out.println(year + (" это високосный год"));
        }else{
            System.out.println(year + " это не високосный год");
        }

        //Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуются одни сутки");
        }else if (deliveryDistance <= 20 || deliveryDistance <= 60){
            System.out.println("Потребуются двое суток");
        } else{
            System.out.println("Потребуется трое суток");
        }


        //Задача 5
        int monthNumber =13;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            break;
            default:
            System.out.println("Некоректный месяц " + monthNumber);
        }




    }

}