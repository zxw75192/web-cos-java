package com.demo.controller.Api;

import com.demo.property.CosProperties;
import com.demo.utils.qcould.QcloudStsAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
public class CommonApiController {
    @Autowired
    private CosProperties cosProperties;

    @GetMapping("/uploadSign")
    public Map<String, String> uploadSign(@RequestParam(value = "method") String method,
                                          @RequestParam(value = "pathname") String pathname) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        QcloudStsAuth stsAuth = new QcloudStsAuth(cosProperties);
        Map<String, String> map = stsAuth.sign(method, pathname);
        return map;
    }
}
