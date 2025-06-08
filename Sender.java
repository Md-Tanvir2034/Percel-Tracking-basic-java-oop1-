public class Sender extends person{
   private String personName ;

   Sender(String name) {
      this.personName = name;
   }

    @Override
    public void setName(String personName){
        this.personName = personName;
    }

    public String getName() {
        return personName;
    }
    
}
