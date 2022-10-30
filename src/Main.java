import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

            public static Scanner sc = new Scanner(System.in);
            public static   Book [] arrayBooks(Book warAndPeace,Book cherryOrchard) {
                Book[] arrayBooks = new Book[5];
                arrayBooks[0] = warAndPeace;
                arrayBooks[1] = cherryOrchard;
                return arrayBooks;
            }
            public static void addBooks(Book [] arrayBooks){
                String  addBooks;
                Author temporaryAuthor;
                System.out.println("Хотите добавить книгу?");
                for (int i = 0; i < arrayBooks.length; i++) {
                    if (arrayBooks[i] == null) {
                        addBooks = sc.nextLine();
                        if (addBooks.equals("да")) {
                            System.out.println("вводите в  указаном  порядке.Каждый параметр с новой строки");
                            System.out.println("Введите автора книги. Сначала фамилию, затем имя");
                            Author temporary = new Author(sc.nextLine(), sc.nextLine());
                            System.out.println("Затем введите название книги и год публикации");
                            arrayBooks[i] = new Book(sc.nextLine(), temporary, sc.nextInt());
                            addBooks.replace("да", "");
                        } else if (addBooks.equals("нет")) {
                            break;
                        }
                    }
                }
            }



            public static void main(String[] args) {

                Author Tolstoy = new Author("Лев", "Толстой");
                System.out.println(Tolstoy.toString());

                Book warAndPeace = new Book("Война и мир ", Tolstoy, 1886);
                System.out.println(warAndPeace.toString());
                warAndPeace.setPublisherYear(1986);
                System.out.println("новый год публикации книги = " + warAndPeace.getPublisherYear());

                System.out.println("--------------");

                Author Chexov = new Author("Антон", "Чехов");
                System.out.println(Chexov.toString());
                Book cherryOrchard = new Book("Вишневый сад",Chexov,1975);
                System.out.println( cherryOrchard.toString());
                cherryOrchard.setPublisherYear(1990);
                System.out.println("новый год публикации книги = " + warAndPeace.getPublisherYear());










            }


        }
