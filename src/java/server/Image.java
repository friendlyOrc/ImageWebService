/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import data.ImageDAO;
import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.*;
import javax.annotation.PostConstruct;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "Images")
public class Image {
    
    private static ArrayList<String> images = new ArrayList<>();
    @PostConstruct
    public void initData() {
//        images.add("img1");
//        images.add("img2");
//        images.add("img3");
//        images.add("img4");
        
    }
    
    @WebMethod(operationName = "getImage")
    public ArrayList<String> getImage(@WebParam(name = "name") String txt) {
        ImageDAO dao = new ImageDAO();
        images = dao.searchImage(txt);
        ArrayList<String> rs = new ArrayList<>();
        for(int i = 0; i < images.size(); i++)
            if(images.get(i).contains(txt))
                rs.add("http://localhost:8080/MidTermServer/images/" + images.get(i));
        return rs;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllImage")
    public ArrayList<String> getAllImage() {
        ImageDAO dao = new ImageDAO();
        images = dao.searchImage("");
        ArrayList<String> rs = new ArrayList<>();
        for(int i = 0; i < images.size(); i++)
            rs.add("http://localhost:8080/MidTermServer/images/" + images.get(i));
        return rs;
    }
}


