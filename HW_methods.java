package Java_DZ.JAVA_DZ_sem1;

public class HW_methods {
    public static void main(String[] args) {
       
        //CheckSumInRange(9, 13); 
        //ChekNumForSign(-2);
        //System.out.println(CheckNumber(-3));
        //StringNtimes("I am learning Java", 4);
        //Array(10, 5);
       
    }
// Написать метод, принимающий на вход два целых числа и проверяющий, 
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
public static void CheckSumInRange(int a, int b) {
    int sum = a + b;
    if (sum >= 10 && sum <= 20)
        System.out.println("True");
    else {
        System.out.println("False");
    }
}
// Написать метод, которому в качестве параметра передается целое число, 
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
public static void ChekNumForSign(int x) {
    if (x >=0) {
        System.out.println("Число положительное");
    }
    else {
        System.out.println("Число отрицательное");
    }
}
// Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
public static boolean CheckNumber(int x){
    if (x < 0){
        return true;
    }
    else {
        return false;
    }
    }

// Написать метод, которому в качестве аргументов передается строка и число, 
// метод должен отпечатать в консоль указанную строку, 
// указанное количество раз;
public static void StringNtimes(String str, int n) {
    for (int i = 1; i <= n; i++) {
        System.out.println(str);
    }
}

// Написать метод, принимающий на вход два аргумента: len и initialValue, 
// и возвращающий одномерный массив типа int длиной len, 
// каждая ячейка которого равна initialValue;
public static void Array(int len,int initialValue) {
    int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "; ");
        }
}

}





