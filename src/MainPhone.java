public class MainPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number="+37529131414";
        phone1.model="Samsung A31";
        phone1.weight=0.350;
        phone1.callerName="David";
        System.out.println(phone1);
        Phone.receiveCall(phone1.callerName);
        Phone.getNumber(phone1.number);
        Phone.receiveCall2(phone1.callerName,phone1.number);

        Phone phone2 = new Phone();
        phone2.number="+375332565689";
        phone2.model="iPhone 13";
        phone2.weight=0.5;
        phone2.callerName="Pat";
        System.out.println(phone2);
        Phone.receiveCall(phone2.callerName);
        Phone.getNumber(phone2.number);
        Phone.receiveCall2(phone2.callerName, phone2.number);

        Phone phone3= new Phone();
        phone3.number="+375442356699";
        phone3.model="LG 45";
        phone3.weight=0.45;
        phone3.callerName="Craig";
        System.out.println(phone3);
        Phone.receiveCall(phone3.callerName);
        Phone.getNumber(phone3.number);
        Phone.receiveCall2(phone3.callerName, phone3.number);

    }
}
