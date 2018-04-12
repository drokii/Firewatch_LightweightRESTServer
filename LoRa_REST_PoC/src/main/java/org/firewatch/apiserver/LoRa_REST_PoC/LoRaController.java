package org.firewatch.apiserver.LoRa_REST_PoC;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class LoRaController {

    @RequestMapping(method = POST, value = "/broadcast", consumes = {"application/json"})
    public void receiveBroadcast(@RequestParam("app_id") String test) {
        try {
            System.out.println(test);
        } catch(Exception e) {
            System.out.println("Broadcast was recieved, but something went wrong: " + e.getMessage());
        }

    }
}


