package Observer;

import Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StocksObservable stockObservable;

    public EmailAlertObserver(String emailId,StocksObservable stockObservable){
        this.emailId=emailId;
        this.stockObservable=stockObservable;
    }


    @Override
    public void update() {
        sendMail(emailId,"product is in stock hurry up!!!");
    }

    public void sendMail(String emailId,String msg){
        System.out.println("mail sent to : "+emailId);
        //send the actual email to the end user
    }
}