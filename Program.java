package PhoneBook;

public class Program {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        int phone1;
        int phone2;
        int phone3;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            name3 = "Popov";
            name4 = "Volkov";
            phone1 = 123456;
            phone2 = 654321;
            phone3 = 987789;
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            phone1 = Integer.parseInt(args[4]);
            phone2 = Integer.parseInt(args[5]);
            phone3 = Integer.parseInt(args[6]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name4, phone1);
        myPhoneBook.add(name4, phone2);
        myPhoneBook.add(name4, phone3);

        //System.out.println(myPhoneBook.find(name1));
        //System.out.println(PhoneBook.getPhoneBook());
        myPhoneBook.printPhoneBook();

    }
}
