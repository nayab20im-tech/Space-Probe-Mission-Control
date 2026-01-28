public class Main {
    public static void main(String[] args) {
        LList list = new LList();
        list.add(5);
        list.add(15);
        list.add(32);
        list.add(3);
        list.add(10);
        list.add(51);
        list.add(2);
        display(list);
        list.removeAllOddValues();
        System.out.println("New List");
        display(list);
    }
    public static void display(LList list) {
        int numberOfEnteries = list.getLength();
        for(int position=1; position<=numberOfEnteries; position++){
            System.out.println(list.getEntry(position));
        }
    }


}
