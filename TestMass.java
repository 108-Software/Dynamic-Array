import java.util.Scanner;

public class TestMass <T>{
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        Dmass Dm = new Dmass<>();

        System.out.print("Введите размер массива: ");
        int Staticsize = sc.nextInt();
        Dm.setMass(Staticsize);
        System.out.print(" 1. Добавление элемента в начало массива \n");
        System.out.print(" 2. Добавление элемента в конец массива \n 3. Удаление последнего элемента массива \n");
        System.out.print(" 4. Удаление элемента по индексу \n 5. Вставка элемента по ндексу \n");
        System.out.print(" 6. Очистка массива \n 7. Узнать текущую длину \n");
        System.out.print(" 8. Вывести массив \n 9. Завершить программу \n");

        int answer = 0;
        while (answer > 1 | answer < 9) {

            answer = sc.nextInt();
            var gh = sc.nextLine();

            if (answer==9 | answer>9 | answer == 0 | answer<0){break;}

            else{

                switch (answer){

                    case 1:
                        System.out.print("Введите элемент которой хотите добавить: ");
                        var addf = sc.nextLine();
                        Dm.AddFirst(addf);
                        break;

                    case 2:
                        System.out.print("Введите элемент которой хотите добавить: ");
                        var addl = sc.nextLine();
                        Dm.AddLast(addl);
                        break;

                    case 3:
                        Dm.RemLast();
                        break;

                    case 4:
                        System.out.print("Какой элемент хотите удалить? ");
                        int REind = sc.nextInt();
                        Dm.RemIndex(REind-1);
                        break;

                    case 5:
                        System.out.print("На какое место ставим элемент? ");
                        int ADDind = sc.nextInt();
                        String Alo = sc.nextLine();
                        System.out.print("Введите элемент: ");
                        var data = sc.nextLine();
                        Dm.AddIndex(ADDind-1, data);
                        break;

                    case 6:
                        Dm.RemAll();
                        break;

                    case 7:
                        Dm.Size();
                        break;

                    case 8:
                        Dm.Print();
                        break;

                }
            }
        }
    }
}
