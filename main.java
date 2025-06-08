public class main {
    public static void main(String[] args) {

      Receiver receiver = new Receiver("AIUB");
      Sender sender = new Sender("Adamjee");
        
      Percel p = new Percel ("24-60390-3" , "Nirjar" , "BAshundhara" , receiver , sender );
      p.addItem(new Item("Md.", 100.0));     
      p.addItem(new Item("Tanvir", 500.0));
      p.addItem(new Item("Mahmud", 50.0));

      p.show();
      p.removeItem(new Item("Tanvir", 500.0));
      System.out.println("After removing an item:");
      p.show();

        
    }


    
}
