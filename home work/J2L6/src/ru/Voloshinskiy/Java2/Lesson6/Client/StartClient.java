package ru.Voloshinskiy.Java2.Lesson6.Client;

import java.io.IOException;

/**
 * Created by Alexander V on 15.01.2017.
 */
public class StartClient {
    public static void main(String[] args){
        try {
            Connection connect = new Connection("KolbasnijCeh",8189);

//            Thread tInputConnection = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        while(!connect.isClosed())
//                            System.out.println(connect.input());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            tInputConnection.start();
//            tInputConnection.join();
            connect.output();
            System.out.println(connect.input());


//            Thread tOutputConnection = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    while(!connect.isClosed())
//                        try {
//                            connect.output();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                }
//            });
//            tOutputConnection.start();
//            tOutputConnection.join();


        } catch (IOException e) {
            e.printStackTrace();
        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
