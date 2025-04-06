package Observer;

import Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String userName;
    StocksObservable stockObservable;

    public MobileAlertObserver(String userName,StocksObservable stockObservable){
        this.userName=userName;
        this.stockObservable=stockObservable;
    }


    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock hurry up!!!");
    }

    public void sendMsgOnMobile(String userName,String msg){
        System.out.println("msg sent to : "+userName);
    }
}