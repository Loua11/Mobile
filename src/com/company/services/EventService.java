/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.services;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.Dialog;
import com.codename1.ui.TextField;
import com.codename1.ui.util.Resources;
import com.company.utils.Statics;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class EventService {
    
    public static EventService instance = null;
    public static boolean resultOK = true;
    private ConnectionRequest rq;
    
    public static EventService getInstance(){
        if (instance == null)
            instance = new EventService();
        return instance;
    }
    
    
     public EventService() {
        rq = new ConnectionRequest();
        
    }
    
     public void AddEvent(TextField titre, Date date, TextField lieu, TextField image, Date updated_at, Resources res  ) {
       
        Date date1 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateText = formatter.format(date1);

        Date date101 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString11 = formatter.format(date101);

       
        String url = Statics.BASE_URL+"/evenement/mobile/ajout" 
                + "?titre=" +titre.getText()+""
                + "&date=" +dateText+""
                + "&lieu=" +lieu.getText()+""
                + "&image="+image.getText()+""
                + "&updated_at="+dateString11+"";

        rq.setUrl(url);
       
        //Control saisi
        if(titre.getText().equals(" ") && dateText.equals(" ") && lieu.getText().equals(" ") && image.getText().equals(" ") && dateString11.equals(" ")) {
           
            Dialog.show("Erreur","Veuillez remplir les champs","OK",null);
           
        }
       
        //hethi wa9t tsir execution ta3 url
        rq.addResponseListener((e1)-> {
         
            //njib data ly7atithom fi form
            byte[]data = (byte[]) e1.getMetaData();
            String responseData = new String(data);
           
            System.out.println("data ===>"+responseData);
        }
        );
       
       
        //ba3d execution ta3 requete ely heya url nestanaw response ta3 server.
         NetworkManager.getInstance().addToQueueAndWait(rq);
    }
           
       
    }


    
    
