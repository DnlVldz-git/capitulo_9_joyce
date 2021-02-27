/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

/**
 *
 * @author dani
 */
public class Event implements Comparable <Event>{
    public final int PRICE_PER_GUEST =35;
    public final int CUTOFF = 50;
    private String event_number;
    private int event_type;
    private String event_types;
    private Integer n_guests;
    private double price;
    private String phone_number;
    private int comparaciones;

    public Event(){
        this.comparaciones = 0;
        setEventNumber("A000");
        setNGuests(0);
    }

    public void getEventTypeString() {
        switch (this.event_type) {
            case 1:
                this.event_types ="Wedding";               
            case 2:
                this.event_types ="Baptism";
            case 3:
                this.event_types ="Birthday";
            case 4:
                this.event_types ="Corporate";
            default:
                this.event_types ="Other";
        }        
    }

    public void setEventType(int event_type) {
        this.event_type = event_type;
    }    
    
    public void setPhoneNumber(String num){
        num = num.replace('(', '\0');
        num = num.replace(')', '\0');
        num = num.replace('-', '\0');
        num = num.replace(' ', '\0');
        num = num.replaceAll("\0", "");
        if (num.length()!=10) {
            num = "0000000000";
        }
        this.phone_number = num;
    }
    
    public String getPhoneNumber(){
        StringBuilder s = new StringBuilder(this.phone_number);
        s.insert(0, "(");                    
        s.insert(4, ")");
        s.insert(5, " ");        
        s.insert(9, "-");                
        
        this.phone_number = s.toString();
        return this.phone_number;
    }
    
    public Event(String event_n, int n_guests){
        setEventNumber(event_n);
        setNGuests(n_guests);
    }
    
    
    public void setEventNumber(String event_number) {
        this.event_number = event_number;
    }
    
    public String getEventTypes(){
        return this.event_types;
    }    

    public void setNGuests(int n_guests) {
        this.n_guests = n_guests;
        this.price = this.n_guests*this.PRICE_PER_GUEST;
    }

    public String getEventNumber() {
        return event_number;
    }

    public int getNGuests() {
        return n_guests;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Event{" + "PRICE_PER_GUEST=" + PRICE_PER_GUEST + ", event_number=" + event_number + ", event_types=" + event_types + ", n_guests=" + n_guests + ", price=" + price + ", phone_number=" + phone_number + '}';
    }

    public void comparaciones(int n, Event o){
        switch (n) {
            case 1:
                this.comparaciones = event_number.compareTo(o.getEventNumber());
                break;
            case 2:
                this.comparaciones = n_guests.compareTo(o.getNGuests());
                break;
            case 3:
                this.comparaciones = event_types.compareTo(o.getEventTypes());
                break;
        }
    }
    
    
    @Override
    public int compareTo(Event o) {
        return this.comparaciones;
    }

}
