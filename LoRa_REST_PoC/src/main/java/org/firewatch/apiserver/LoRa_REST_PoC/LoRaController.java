package org.firewatch.apiserver.LoRa_REST_PoC;

import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class LoRaController {

    @RequestMapping(method = POST, value = "/broadcast")
    public void receiveBroadcast(@RequestParam("app_id") String app_id) {
        try {
            System.out.println(app_id);
        } catch(Exception e) {
            System.out.println("Broadcast was recieved, but something went wrong: " + e.getMessage());
        }

    }
}


