import java.util.*;



public  class Percel implements InnerPercelOperations {
        private String parcelId ;
        private String fromLocations ;
        private String toLocations ;
        private Receiver receiver;
        private Sender sender;
        private List<Item> items;



        Percel(String parcelId , String fromLocations ,String toLocations , Receiver receiver, Sender sender) {
            setParcelId(parcelId);
            setFromLocations(fromLocations);    
            setToLocations(toLocations);
            setReceiver(receiver);
            setSender(sender);
            setItems(items);
            this.items = new ArrayList<>(); 


        }

    
        public String getParcelId() {
            return parcelId;
        }
        public void setParcelId(String parcelId) {
            this.parcelId = parcelId;
        }

        public String getFromLocations() {
            return fromLocations;
        }
        public void setFromLocations(String fromLocations) {
            this.fromLocations = fromLocations;
        }

        public String getToLocations() {
            return toLocations;
        }
        public void setToLocations(String toLocations) {
            this.toLocations = toLocations;
        }
        public Receiver getReceiver() {
            return receiver;
        }
        public void setReceiver(Receiver receiver) {
            this.receiver = receiver;
        }
        public Sender getSender() {
            return sender;
        }
        public void setSender(Sender sender) {
            this.sender = sender;
        }
        public List<Item> getItems() {
            return items;
        }
        public void setItems(List<Item> items) {
            this.items = items;
        }

        @Override
        public void addItem(Item item ) {
            if (items == null) {
                items = new ArrayList<>();
            }
            items.add(item);
        }

        public void removeItem(Item item) {
            for(Item i : items) {
                if (i.getItemName().equals(item.getItemName()) && i.getItemPrice() == item.getItemPrice()) {
                    items.remove(i);
                    System.out.println("Item removed: " + item.getItemName());
                    return;
                }
            }
        }

        public void show() {
            System.out.println("Parcel ID: " + parcelId);
            System.out.println("From: " + fromLocations);
            System.out.println("To: " + toLocations);
            System.out.println("Receiver: " + receiver.getName());
            System.out.println("Sender: " + ( sender.getName()));
            if (items != null && !items.isEmpty()) {
                System.out.println("Items in the parcel:");
                for (Item item : items) {
                    System.out.println("Item Name: " + item.getItemName() + ", Price: " + item.getItemPrice());
                }
            } else {
                System.out.println("No items in the parcel.");
            }
        }
    
}
