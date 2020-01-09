package ltd.newbee.mall.controller.common;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "pay")
public class PayMall {


    /**
     * 用户支付
     */
    @PostMapping(value = "/orderPay")
    @ResponseBody
    public void orderPay(HttpServletRequest request,String money){


    }

}
